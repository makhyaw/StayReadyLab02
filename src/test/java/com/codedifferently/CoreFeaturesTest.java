package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class CoreFeaturesTest {
    @Test

    public void addTest(){
        
        //Given
        final CoreFeature cf = new CoreFeature();
        final Double expected = 6.0;
        // When
        final Double actual = cf.add(5.0);
        // Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test

    public void subTest() {

        // Given
        final CoreFeature cf = new CoreFeature();
        final Double expected = .0;
        // When
        final Double actual = cf.subtract(1.0);
        // Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test

    public void divideTest() {

        // Given
        final CoreFeature cf = new CoreFeature();
        final Double expected = 1.0;
        // When
        final Double actual = cf.divide(1.0);
        // Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void multiplyTest() {

        // Given
        final CoreFeature cf = new CoreFeature();
        final Double expected = 3.0;
        // When
        final Double actual = cf.multiply(3.0);
        // Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test

    public void ExpTest() {

        // Given
        final CoreFeature cf = new CoreFeature();
        final Double expected = 4.00;
        // When
        final Double actual = cf.Exp(2.0);
        // Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test

    public void squarDoubleTest() {

        // Given
        final CoreFeature cf = new CoreFeature();
        final Double expected = 4.0;
        // When
        final Double actual = cf.squarDouble(2.0);
        // Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void squareroot(){

        // Given
        CoreFeature cf = new CoreFeature();
        Double expected = 1.0;
        // When
        Double actual = cf.squareroot(1.0);
        // Then
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void invertSign(){

        // Given
        CoreFeature cf = new CoreFeature();
        Double expected = -2.0;
        // When
        Double actual = cf.invertSign(2.0);
        // Then
        Assert.assertEquals(expected, actual, 0);
    }

    
    

}