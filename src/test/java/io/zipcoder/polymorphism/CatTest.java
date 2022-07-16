package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CatTest extends TestCase {

    @Test
    public void testSpeak() {
        Cat cat = new Cat("catto");
        cat.speak();
        Assert.assertEquals("Meoow", cat.speak());
    }
}