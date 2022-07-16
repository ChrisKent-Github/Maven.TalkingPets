package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class GerbilTest extends TestCase {

    @Test
    public void testSpeak() {
        Gerbil gerbil = new Gerbil("Gerbilero");
        gerbil.speak();
        Assert.assertEquals("Gerbil Noise", gerbil.speak());
    }
}