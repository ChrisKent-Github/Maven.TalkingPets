package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class DogTest extends TestCase {

    @Test
    public void testSpeak() {
        Dog dog = new Dog("doggo");
        dog.speak();
        Assert.assertEquals("Arrf", dog.speak());
    }
}