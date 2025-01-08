/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vivia3;

/**
 *
 * @author User
 */
public class Viva3Q1 {
    public static void main(String[] args) {
        PotionContainer container = new PotionContainer();

        System.out.println("Adding potions to the container...");
        container.addPotion("Unicorn Tears", 200.0);
        container.addPotion("Dragon Blood", 150.0);
        System.out.println("Potion container successfully initialized.\n");

        System.out.println("=== Using Potions ===");
        container.usePotion("Unicorn Tears", 50.0);
        System.out.println("Remaining volume of Unicorn Tears: " +
                container.getRemainingVolume("Unicorn Tears") + " ml");

        container.usePotion("Dragon Blood", 30.0);
        System.out.println("Remaining volume of Dragon Blood: " +
                container.getRemainingVolume("Dragon Blood") + " ml");

        System.out.println("\nAttempting to use more Dragon Blood than available...");
        container.usePotion("Dragon Blood", 200.0);
        System.out.println("Remaining volume of Dragon Blood: " +
                container.getRemainingVolume("Dragon Blood") + " ml");

        System.out.println("\n=== Checking Potion Availability for Invisibility Draught ===");
        double requiredUnicornTears = 200.0;
        double requiredDragonBlood = 150.0;
        boolean readyForInvisibilityDraught =
                container.isEnoughForPotion(requiredUnicornTears, requiredDragonBlood);

        System.out.println("\nCan prepare Invisibility Draught?");
        if (readyForInvisibilityDraught) {
            System.out.println("Yes, we have enough Unicorn Tears and Dragon Blood!");
        } else {
            System.out.println("No, we do not have enough ingredients to prepare the Invisibility Draught.");
        }
        
        System.out.println("Final State of the potion container: ");
        container.finalPotion();
    }
    
}

class Potion{
    private String ingredient;
    private double volume;
    
    public Potion(String ingredient, double volume){ //contructor
        this.ingredient = ingredient;
        this.volume = volume;
    }
    
    public String getIngredient(){ //get for the ingredient name
        return ingredient;
    }
    
    public double getVolume(){ //get for the remaining volume
        return volume;
    }
    
    public boolean consume(double amount){ //to use potion and reduce volume
        if(amount > volume){
            return false; //if not enough volume to use
        }
        volume -= amount;
        return true;
    }
}

class PotionContainer{
    private Potion[] potions;
    private int potionCount;
    
    public PotionContainer(){ //constructor
        potions = new Potion[20]; //initial capacity of 20 potions
        potionCount = 0;
    }
    
    public void addPotion(String ingredient, double volume){ //methos to add potion
        for(int i = 0; i < potionCount; i++){
            if(potions[i].getIngredient().equals(ingredient)){
                System.out.println(ingredient + " already exists in the container.");
                return;
            }
        }
        if(potionCount < potions.length){
            potions[potionCount++] = new Potion(ingredient, volume);
            System.out.println(volume + " ml of " + ingredient + " added to the container.");
        }
        else{
            System.out.println("Container is full. Cannot add more potions.");
        }
    }
    
    public void usePotion(String ingredient, double amount){ //methos to use potion
        for (int i = 0; i < potionCount; i++) {
            if (potions[i].getIngredient().equals(ingredient)) {
                if(potions[i].consume(amount)){
                    System.out.println(amount + " ml of " + ingredient + " used.");
                } 
                else{
                    System.out.println("Not enough " + ingredient + " available.");
                }
                return;
            }
        }
        System.out.println(ingredient + " not found in the container.");
    }
    
    public double getRemainingVolume(String ingredient){ //method to get remaining volume of a potion
        for (int i = 0; i < potionCount; i++) {
            if (potions[i].getIngredient().equals(ingredient)) {
                return potions[i].getVolume();
            }
        }
        System.out.println(ingredient + " not found in the container.");
        return 0.0;
    }
    
    public boolean isEnoughForPotion(double requiredUnicornTears, double requiredDragonBlood){
        double unicornTears = getRemainingVolume("Unicorn Tears");
        double dragonBloods = getRemainingVolume("Dragon Blood");
        
        return unicornTears >= requiredUnicornTears && dragonBloods >= requiredDragonBlood;
    }
    
    public void finalPotion(){
        System.out.println("--- Potion Inventory ---");
        for (int i = 0; i < potionCount; i++){
            System.out.printf("%s: %.2f ml\n", potions[i].getIngredient(), potions[i].getVolume());
        }
    }
}
