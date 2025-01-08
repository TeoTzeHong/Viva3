/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3q3;

/**
 *
 * @author cyq27
 */

public class Pet {
    
    private String name; 
    private String species;
    private String breed;
    private int age;
    private String healthRecord;
    private boolean isAdopted;
    private String adopterName;

    public Pet(String name, String species, String breed, int age, String healthRecord) {
        this.name = name; 
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.healthRecord = healthRecord;
        this.isAdopted = false;
        this.adopterName = "null";
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public String isAdopted() {
        if (isAdopted) {
            return "adopted";
        }
        else {
            return "not adopted";
        }
    }

    public void adopt(String adopterName) {

        if (!isAdopted) {
            this.isAdopted = true;
            this.adopterName = adopterName;
        }

    }

    public String getDetails() {
        return "PetName: " + name + 
                "\nSpecies: " + species + 
                "\nBreed: " + breed + 
                "\nAge: " + age + 
                "\nHealth Record: " + healthRecord + 
                "\nAdopted: " + isAdopted() + 
                "\nAdopterName: " + adopterName + "\n";
        
    }
}

