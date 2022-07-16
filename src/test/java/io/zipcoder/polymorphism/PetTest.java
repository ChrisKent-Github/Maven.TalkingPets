package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PetTest extends TestCase {

    @Test
    public void testSetNewPetName() {
        Pet pet = new Pet("name");
        pet.setNewPetName("Thispet");
        Assert.assertEquals("Thispet", pet.getPetName());
    }

    @Test
    public void testGetPetName() {
        Pet pet = new Pet("name");
        pet.getPetName();
        Assert.assertEquals("name", pet.getPetName());
    }

    @Test
    public void testSpeak() {
        Pet pet = new Pet("nattadoggo");
        pet.speak();
        Assert.assertEquals("**cough**", pet.speak());
    }
}
