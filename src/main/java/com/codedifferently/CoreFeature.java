package com.codedifferently;

public class CoreFeature extends Display{
    public Double add(double d){
        //System.out.println("this is the current display value inside of the addition function: " + getDisplayValue());
        return d + getDisplayValue();
    }

    public Double subtract(Double num){
        return getDisplayValue() - num;

    }

    public Double divide(Double num){
        return getDisplayValue() / num;

    }

    public Double multiply(Double num){
        return num * getDisplayValue();

    }

    public Double Exp(Double degree){
        return Math.pow(getDisplayValue(), degree);

    }

    public Double squarDouble(Double num){
        return num * num;

    }

    public Double squareroot(Double num){
        return Math.sqrt(getDisplayValue());

    }



    public Double invertSign(Double num){
        return num * -1;

    }

	public double sin(double d) {
		return 0;
	}


    
}