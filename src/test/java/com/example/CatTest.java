package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundIsMeowTrue() {
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        String expected = "Мяу";

        Assert.assertEquals("Кошка издает звук не " + expected, expected, actual);

    }

    @Test
    public void catEatsPredatorFoodWithMock() throws Exception{
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(feline);
        List<String> actual = cat.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        Assert.assertEquals("Семейство кошачьих - хищники", expected, actual);
    }

}