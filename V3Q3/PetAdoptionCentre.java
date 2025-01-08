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

    //constructor initialize the list of pets in centre
    public PetAdoptionCentre() {
        pets = new ArrayList<>();
    }

    //add pets into the list
    public void addPet(Pet pet) {
        pets.add(pet);
    }

    //calls the method if there is adopter
    public void adoptPet(Pet pet, Adopter adopter) {
        
        if (pet.isAdopted().equals("not adopted")) {
            pet.adopt(adopter.name);
            
        } 
        else {
            System.out.println("Pet is already adopted.");
        }
    }
    
    //sort the ages of pets and print all the pets in ascending order by age
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

    //loop  through the pets and returns the pet if its name matches the provided name.
    public Pet getPetByName(String petName) {
        for (Pet pet : pets) {
            if (pet.getName().equalsIgnoreCase(petName)) {
                return pet;
            }
        }
        return null;
    }

    //return info of pets
    public List<Pet> getPets() {
        return pets;
    }
}

