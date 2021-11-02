package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void felineIsPredator() throws Exception{
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        Assert.assertEquals("Семейство кошачьих - хищники", expected, actual);
    }

    @Test
    public void felineGetFamilyFelineInRus() {
        Feline feline = new Feline();

        String actual = feline.getFamily();
        String expected = "Кошачьи";

        Assert.assertEquals("Не относится к семейству " + expected, expected, actual);
    }

}