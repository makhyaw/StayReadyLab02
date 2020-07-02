package com.codedifferently;

import java.util.ArrayList;

public class Memory {

    ArrayList<Double> memoryValue = new ArrayList<Double>();

    public void addToMemory(Double num){
        memoryValue.add(num);
    }

    public void resetMemory(){
        memoryValue.clear();
    }

    public Double recallMemory(){
        return memoryValue.get(memoryValue.size() -1);

    }
    
    
    
}