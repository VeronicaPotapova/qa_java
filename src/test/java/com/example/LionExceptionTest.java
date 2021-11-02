package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class LionExceptionTest {

    @Mock
    Feline feline;

    @Test(expected = Exception.class)
    public void lionFelineIsNullException() throws Exception{
        Lion lion = new Lion(null, "Самка");
}

    @Test(expected = Exception.class)
    public void lionSexIsNotManAndWomenException() throws Exception{
        Lion lion = new Lion(feline, "Оно");
         }

}