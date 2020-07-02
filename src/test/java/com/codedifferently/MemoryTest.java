package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class MemoryTest {
    
    @Test

    public void addToMemoryTest(){

        // Given
        Memory am = new Memory();
        am.addToMemory(5.0);
        Double expected = 5.0;
        // When
        Double actual = am.recallMemory();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void resetMemoryTest(){

        // Given
        Memory am = new Memory();
        am.resetMemory();
        int expected = 0;
        // When
        int actual = am.memoryValue.size();
        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test

    public void recallMemoryTest(){

        // Given
        Memory am = new Memory();
        Double expected = 5.0;
        // When
        am.addToMemory(1.0);
        am.addToMemory(5.0);
        Double actual = am.recallMemory();
        // Then
        Assert.assertEquals(expected, actual);
    }

}