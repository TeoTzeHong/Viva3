/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3q3;

/**
 *
 * @author cyq27
 */
import java.util.*;

class PetAdoptionCentre {
    
    private List<Pet> pets;

    public PetAdoptionCentre() {
        pets = new ArrayList<>();
    }
    
    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void adoptPet(Pet pet, Adopter adopter) {
        
        if (pet.isAdopted().equals("not adopted")) {
            pet.adopt(adopter.name);
            
        } 
        else {
            System.out.println("Pet is already adopted.");
        }
    }
    
    public void viewAvailablePets() {
        
        for (int i=0; i<pets.size(); i++) {
            for (int j=i+1; j<pets.size(); j++) {
                if (pets.get(i).getAge()>pets.get(j).getAge()) {
                    Pet temp = pets.get(i);
                    pets.set(i, pets.get(j));
                    pets.set(j, temp);
                }
            }
        }
        
        for (Pet pet : pets) {
            if (pet.isAdopted().equals("not adopted")) {
                System.out.println(pet.getDetails());
            }
        }
         
         
    }
  
    public Pet getPetByName(String petName) {
        for (Pet pet : pets) {
            if (pet.getName().equalsIgnoreCase(petName)) {
                return pet;
            }
        }
        return null;
    }

    public List<Pet> getPets() {
        return pets;
    }
}

