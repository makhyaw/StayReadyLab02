package com.codedifferently;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class SciCalculator 
{
    // currentVal
    private Double currentValue = 0.0; 

    private DisplayMode displayMode;

    private TrigFunctions trigFunctions;

    private Memory memory;

    private CoreFeature coreFeature;

    private TrigUnits trigUnits;

    //added display
    //private Display display;


    public SciCalculator(){
        this.currentValue = 0.0;
        this.displayMode = new DisplayMode();
        this.trigFunctions = new TrigFunctions();
        //added new display object 
        //this.display = new Display();
        this.memory = new Memory();
        this.coreFeature = new CoreFeature();
        this.trigUnits = new TrigUnits();

    }
    
    public static void main( String[] args ) 
    {
        SciCalculator sc = new SciCalculator();
        System.out.println("Welcome to your new Scientific Calculator! Please enter a number: ");
        Scanner input = new Scanner(System.in); //system.close()
        double userNumber = input.nextDouble();
        //sc.setDisplayValue(userNumber);
        
        System.out.println("The number you entered is " + userNumber);
        System.out.println("Enter a second number: ");
        double userNumber2 = input.nextDouble();

        //sc.currentValue = sc.coreFeature.add(userNumber);
        //sc.setDisplayValue(firstAdd);
        System.out.println("after the first addition " + sc.currentValue);
        //sc.currentValue = sc.coreFeature.add(userNumber2);
        //sc.display.setDisplayValue(secondAdd);
        System.out.println("after the second addition " + sc.currentValue);
        System.out.println(" Enter an operation or Trig Function you would like to use: ");
        //System.out.println(" Enter an operation or Trig Function you would like to use: ");
        //int userWord = input.nextInt();

    
        //if (userWord == 1){
            /*System.out.println("Enter a second number: ");
            double userNumber2 = input.nextDouble();

            CoreFeature cf = new CoreFeature();

            System.out.println(cf.add(userNumber2));

        }*/
    }

    public Double getDisplayValue(){
        return currentValue;
    }

    public void setDisplayValue(Double dv){
        currentValue = dv;
    }

    public void clearDisplayValue(){
        currentValue = 0.0;
    }

    public Memory getMemory() {
        return this.memory;
    }

    public DisplayMode getDisplayMode(){
        return this.displayMode;
    }
    public CoreFeature getCoreFeature(){
        return this.coreFeature;
    }
    public TrigFunctions getTrigFunctions(){
        return this.trigFunctions;
    }
    public TrigUnits getTrigUnits(){
        return this.trigUnits;
    }
}
