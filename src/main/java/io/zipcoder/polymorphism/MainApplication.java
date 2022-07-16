package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfPets;
        String typeOfPet;
        String petName;
        ArrayList<Pet> petList = new ArrayList<Pet>();

        System.out.println("How many pets do you have?");
        numberOfPets = Integer.parseInt(input.nextLine());
        for(int i = 0; i < numberOfPets; i++) {
            System.out.println("What type of pet do you have?");
            typeOfPet = input.nextLine();
            System.out.println("What is your pet's name?");
            petName = input.nextLine();

            if (typeOfPet.equalsIgnoreCase(("dog"))) {
                petList.add(new Dog(petName));
            } else if (typeOfPet.equalsIgnoreCase(("cat"))) {
                petList.add(new Cat(petName));
            } else if (typeOfPet.equalsIgnoreCase(("gerbil"))) {
                petList.add(new Gerbil(petName));
            } else {
                petList.add(new Pet(petName));
            }
        }
        for (int i = 0; i < petList.size(); i++){
            System.out.println("-" + petList.get(i).speak() + "' - " + petList.get(i).getPetName());
        }
    }


}
