package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionManeParametersTest {

    @Mock
    Feline feline;

    @Before
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    private final String lionSex;
    private final boolean expected;

    public LionManeParametersTest(String lionSex, boolean expected){
        this.lionSex = lionSex;
        this.expected = expected;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] maneData() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false},
        };
    }

    @Test
    public void shouldBeMane() throws Exception{
        Lion lion = new Lion(feline, lionSex);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

}