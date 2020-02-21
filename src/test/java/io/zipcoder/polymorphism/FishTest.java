package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class FishTest {

    @Test
    public void TestCat() {
        Fish doge = new Fish("Nemo");
        String actual = doge.getName();
        String expected = "Nemo";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestSpeak() {
        String actual = new Fish("Nemo").speak();
        String expected = "Blub";
        Assert.assertEquals(expected, actual);
    }

}
