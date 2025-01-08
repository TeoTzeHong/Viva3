/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3q3;

/**
 *
 * @author cyq27
 */
//defines the attributes for a pet in the pet adoption system
public class Pet {
    
    private String name; //stores pet's name
    private String species;
    private String breed;
    private int age;
    private String healthRecord;
    private boolean isAdopted;
    private String adopterName;

    //constructor initializes a new pet object with the provided attributes
    public Pet(String name, String species, String breed, int age, String healthRecord) {
        this.name = name; //sets the name
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.healthRecord = healthRecord;
        this.isAdopted = false; //initialize the status to not adopted
        this.adopterName = "null"; //as no one has adopted the pet yet
    }

    //getters-return the values of the pet's attributes
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

    //updates the pet's adoption status
    public void adopt(String adopterName) {
        //!isAdopted means there is no adopter so it is true and enter the if block 
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

