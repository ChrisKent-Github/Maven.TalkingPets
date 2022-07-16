package io.zipcoder.polymorphism;

public class Gerbil extends Pet {

    public Gerbil(String petName) { super(petName); }

    @Override
    public String speak() {
        return "Gerbil Noise";
    }
}

