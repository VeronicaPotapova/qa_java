package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class FelineParametersTest {

    private final int actualKittens;
    private final int expected;

    public FelineParametersTest(int actualKittens, int expected){
        this.actualKittens = actualKittens;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][] {
                { 5, 5},
                { 1, 1},
        };
    }

    @Test
    public void shouldBeKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens(actualKittens);
        assertEquals(expected, actual);
    }

}