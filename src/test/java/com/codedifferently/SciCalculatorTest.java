package com.codedifferently;

import org.junit.*;
// import org.junit.Assert.assertEquals;
// import org.junit.Assert;
// import org.junit.Test;

public class SciCalculatorTest 
{
    /**
     * Rigorous Test :-)
     */
    
    @Test
    public void getDisplayValueTest(){

        // Given
        SciCalculator calc = new SciCalculator();
        Double expected = 0.0;
        // When
        Double actual = calc.getDisplayValue(); 
        // Then
        Assert.assertEquals(expected, actual, 0.001);
    }


    @Test
    public void setDisplayValueTest(){

        // Given
        SciCalculator calc = new SciCalculator();
        Double expected = 2.0;
        // When
        calc.setDisplayValue(2.0);
        Double actual = calc.getDisplayValue();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void clearDisplayValueTest(){

        // Given
        SciCalculator calc = new SciCalculator();
        Double expected = 0.0;
        // When
        calc.clearDisplayValue();
        Double actual = calc.getDisplayValue();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMemoryTest() {
        //given 
        Double expectedValue = 3.0;
        SciCalculator calc = new SciCalculator();
        //this is the method that you are testing
        Memory mem = calc.getMemory();

        //when 
        
        mem.addToMemory(3.0);
        double actualValue = mem.recallMemory();

        //then
        Assert.assertEquals(expectedValue, actualValue, 0.0);
    }

    @Test
    public void getDisplayModeTest() {
        //given 
        String expectedValue = "decimal";
        SciCalculator calc = new SciCalculator();
        //this is the method that you are testing
        DisplayMode dm = calc.getDisplayMode();

        //when 
        
        String actual = dm.getMode();

        //then
        Assert.assertEquals("testing the getDisplayMode method", expectedValue, actual);;
    }

    @Test
    public void getCoreFeatureTest() {
        //given 
        Double expectedValue = 4.0;
        SciCalculator calc = new SciCalculator();
        //this is the method that you are testing
        CoreFeature core = calc.getCoreFeature();

        //when 
        
        double actualValue = core.add(4.0);

        //then
        Assert.assertEquals(expectedValue, actualValue, 0.0);
    }
    @Test
    public void getTrigFunctionsTest() {
        //given 
        Double expectedValue = 0.0;
        SciCalculator calc = new SciCalculator();
        //this is the method that you are testing
        TrigFunctions core = calc.getTrigFunctions();

        //when 
        
        double actualValue = core.sine(0.0);

        //then
        Assert.assertEquals(expectedValue, actualValue, 0.0);
    }

    @Test
    public void getTrigUnitsTest() {
        //given 
        String expectedValue = "Degrees";
        SciCalculator calc = new SciCalculator();
        //this is the method that you are testing
        TrigUnits unit = calc.getTrigUnits();

        //when 
        
        String actualValue = unit.getMode();

        //then
        Assert.assertEquals("this is a test", expectedValue, actualValue);
    }
}