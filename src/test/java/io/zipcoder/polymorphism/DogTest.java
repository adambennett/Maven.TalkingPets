package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void TestDog() {
        Dog doge = new Dog("Fido");
        String actual = doge.getName();
        String expected = "Fido";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestSpeak() {
        String actual = new Dog("Doge").speak();
        String expected = "Bark";
        Assert.assertEquals(expected, actual);
    }

}
