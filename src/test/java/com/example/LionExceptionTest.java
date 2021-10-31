package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class LionExceptionTest {

    @Mock
    Feline feline;

    @Test(expected = Exception.class)
    public void lionFelineIsNullException() throws Exception{
        //Mockito.when(feline).thenReturn(null);
        Lion lion = new Lion(null, "Самка");
}

    @Test(expected = Exception.class)
    public void lionGetKittensOneIsTrue() throws Exception{
        Lion lion = new Lion(feline, "Оно");
         }

}