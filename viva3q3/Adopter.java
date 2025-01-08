/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3q3;

/**
 *
 * @author cyq27
 */
public class Adopter {
    //defines adopter's attributes
    String name;
    private String preferredSpecies;
    private String preferredAgeRange;

    //constructor initializes an adopter object with the name, preferred species and preferred age range.
    public Adopter(String name, String preferredSpecies, String preferredAgeRange) {
        
        this.name = name;
        this.preferredSpecies = preferredSpecies;
        this.preferredAgeRange = preferredAgeRange;
        
    }

    //to check if pets match the adopter's preferences
    public void viewMatchingPets(PetAdoptionCentre centre) {
        boolean foundMatchingPet = false; //initialize 
                        
        String[] ageRange = preferredAgeRange.split("-"); 
        int minAge = Integer.parseInt(ageRange[0]); //split into min and max age
        int maxAge = Integer.parseInt(ageRange[1]);
        
        //check all the pets 
        for (Pet pet : centre.getPets()) {
            
            //check for each pet if the pet is not addpted and match the adopter's preference species
            if (pet.isAdopted().equals("not adopted") && pet.getSpecies().equalsIgnoreCase(preferredSpecies)) {
                //check if the pet match the adopter's preferance age range
                if (pet.getAge() >= minAge && pet.getAge() <= maxAge) {
                    foundMatchingPet = true;
                    System.out.println(pet.getDetails());
                    
                }
            }
        }
        //if there is no pets match the adopter's preference
        if (!foundMatchingPet) {
            System.out.println("No matching pets found.");
        }
    }
}
