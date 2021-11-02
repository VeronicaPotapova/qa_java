package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void lionEatsPredatorFoodWithMock() throws Exception{
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion(feline, "Самка");
        List<String> actual = lion.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        Assert.assertEquals("Семейство кошачьих - хищники", expected, actual);
    }

    @Test
    public void lionGetOneKittens() throws Exception{
        Feline feline = new Feline();
        Lion lion = new Lion(feline, "Самка");
        int actual = lion.getKittens();
        int expected = 1;
        Assert.assertEquals("Lion has got one kitten", expected, actual);
    }


}