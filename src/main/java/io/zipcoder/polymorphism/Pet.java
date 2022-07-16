package io.zipcoder.polymorphism;

public class Pet {
    private String petName;


    public Pet(String petName){
        this.petName = petName;
    }

    public void setNewPetName(String newName){
        this.petName = newName;
    }

    public String getPetName() { return petName; }

    public String speak(){
        return "**cough**";
    }

}
