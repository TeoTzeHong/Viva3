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

    String name;
    private String preferredSpecies;
    private String preferredAgeRange;


    public Adopter(String name, String preferredSpecies, String preferredAgeRange) {
        
        this.name = name;
        this.preferredSpecies = preferredSpecies;
        this.preferredAgeRange = preferredAgeRange;
        
    }

    public void viewMatchingPets(PetAdoptionCentre centre) {
        boolean foundMatchingPet = false; 
                        
        String[] ageRange = preferredAgeRange.split("-"); 
        int minAge = Integer.parseInt(ageRange[0]);
        int maxAge = Integer.parseInt(ageRange[1]);
        
        for (Pet pet : centre.getPets()) {
            
            if (pet.isAdopted().equals("not adopted") && pet.getSpecies().equalsIgnoreCase(preferredSpecies)) {
                
                if (pet.getAge() >= minAge && pet.getAge() <= maxAge) {
                    foundMatchingPet = true;
                    System.out.println(pet.getDetails());
                    
                }
            }
        }

        if (!foundMatchingPet) {
            System.out.println("No matching pets found.");
        }
    }
}
