package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class TrigFunctionsTest {
    @Test
    public void sineTest(){

        //Given 
        Display view = new Display();
        //SciCalculator calc = new SciCalculator();
        view.setDisplayValue(Math.PI / 2);
        TrigFunctions cf = new TrigFunctions();
        Double expected = 1.0;


        //When
        double value = view.getDisplayValue();

        double actual = cf.sine(value);
        //Then
        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void cosineTest(){

        //Given 
        Display view = new Display();
        view.setDisplayValue(0.0);
        TrigFunctions cf = new TrigFunctions();
        Double expected = 1.0;


        //When
        double value = view.getDisplayValue();

        double actual = cf.cosine(value);
        //Then
        Assert.assertEquals(expected, actual, 0);

    }
    @Test
    public void tangentTest(){

        //Given 
        Display view = new Display();
        view.setDisplayValue(Math.PI / 4);
        TrigFunctions cf = new TrigFunctions();
        Double expected = 1.0;


        //When
        double value = view.getDisplayValue();

        double actual = cf.tangent(value);
        //Then
        Assert.assertEquals(expected, actual, .1);

    }

    @Test
    public void inverseSineTest(){

        //Given 
        Display view = new Display();
        view.setDisplayValue(1.0);
        TrigFunctions cf = new TrigFunctions();
        Double expected = Math.PI /2;


        //When
        double value = view.getDisplayValue();

        double actual = cf.inverseSine(value);
        //Then
        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void inverseCosentTest(){

        //Given 
        Display view = new Display();
        view.setDisplayValue(0.0);
        TrigFunctions cf = new TrigFunctions();
        Double expected = Math.PI /2;


        //When
        double value = view.getDisplayValue();

        double actual = cf.inverseCosent(value);
        //Then
        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void inverseTanTest(){

        //Given 
        Display view = new Display();
        view.setDisplayValue(0.0);
        TrigFunctions cf = new TrigFunctions();
        Double expected = 0.0;


        //When
        double value = view.getDisplayValue();

        double actual = cf.inverseTan(value);
        //Then
        Assert.assertEquals(expected, actual, 0);

    }

    
}