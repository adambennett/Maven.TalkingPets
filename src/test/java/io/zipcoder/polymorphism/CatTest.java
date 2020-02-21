package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void TestCat() {
        Cat doge = new Cat("Fido");
        String actual = doge.getName();
        String expected = "Fido";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestSpeak() {
        String actual = new Cat("Fido").speak();
        String expected = "Meow";
        Assert.assertEquals(expected, actual);
    }

}
