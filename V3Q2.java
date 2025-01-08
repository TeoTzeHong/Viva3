/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3;

/**
 *
 * @author User
 */
public class V3Q2 {
    public static void main(String[]args){
        //Create a new zoo with space for 3 creatures
        Zoo myZoo=new Zoo(3);
        
        //Add creatures to the zoo
        myZoo.addCreature("Panda", 150.0, "Mountains");
        myZoo.addCreature("Dragon", 300.0, "Cave");
        myZoo.addCreature("Master Oogway", 200.0, "Forest");
        
        //Try adding one more creature to the full zoo
        myZoo.addCreature("Patrick Star", 250.0, "Rock");
        //Should print "Zoo is full!"
        
        //Display all creatures in the zoo
        myZoo.displayAllCreatures();
        
        //Feed the Dragon
        myZoo.feedCreature("Dragon", 50.0);
        
        //Display updated creature details
        myZoo.displayAllCreatures();

    }
}

class Creature{
    private String species;
    private double magicPower;
    private String habitat;
    
    public Creature(String species,double magicPower,String habitat){
        this.species=species;
        this.magicPower=magicPower;
        this.habitat=habitat;
    }
    
    public void feed(double foodAmount){
        this.magicPower+=foodAmount;
        System.out.println(this.species + "'s magic power increased to " + this.magicPower +".");
    }
    
    public void displayInfo(){
        System.out.println("Species: " + species);
        System.out.println("Magic Power: " + magicPower);
        System.out.println("Habitat: " + habitat);
        System.out.println();
    }
    
    public String getSpecies(){
        return this.species;
    }
}

class Zoo {
    private Creature[]creature;
    private int creatureCount;
    
    public Zoo(int maxNumCreatures){
        this.creature=new Creature[maxNumCreatures];
        this.creatureCount=0;
    }
    
    public void addCreature(String species,double magicPower,String habitat){
        if(creatureCount<creature.length){
            creature[creatureCount]=new Creature(species,magicPower,habitat);
            creatureCount++;
            System.out.println(species+ " added to the zoo.");
        }
        else{
            System.out.println("Zoo is full! Cannot add more creatures.");
        }
    }
    
    public void feedCreature(String species,double foodAmount){
        for(int i=0;i<creatureCount;i++){
            if(creature[i].getSpecies().equals(species)){
                creature[i].feed(foodAmount);
                return;
            }
             
        }
    }
   
    public void displayAllCreatures(){
        for(int i=0;i<creatureCount;i++){
            creature[i].displayInfo();
        }
    }
}