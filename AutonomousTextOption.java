package org.firstinspires.ftc.teamcode.AutoOptions;

/**
 * Created by Fusion on 10/30/2017.
 */

public class AutonomousTextOption extends AutonomousOption {

    private String[] allowedValues;
    private int currentValue;

    public AutonomousTextOption (String iName, String[] iVals){
        name = iName;
        optionType = OptionTypes.STRING;
        allowedValues = iVals;
        currentValue = 0;
    }

    public AutonomousTextOption (String iName, String iStartVal, String[] iVals) {
        name = iName;
        optionType = OptionTypes.STRING;
        allowedValues = iVals;
        int index = 0;
        currentValue = -1;

        while (index < allowedValues.length && currentValue < 0) {
            if (allowedValues[index].equals(iStartVal)) {
                currentValue = index;
            }

            index = index + 1;
        }

        if (currentValue < 0) {
            currentValue = 0;
        }
    }

    public void nextValue (){
        currentValue = currentValue + 1;
        if (currentValue >= allowedValues.length){
            currentValue = 0;
        }
    }

    public void previousValue (){
        currentValue = currentValue - 1;
        if (currentValue < 0){
            currentValue = allowedValues.length - 1;
        }
    }

    public String getValue (){
        return allowedValues [currentValue];
    }

    public String getStrValue (){
        return allowedValues [currentValue];
    }

    public void setValue (String iVal){
        int previousValue = currentValue;
        int index = 0;
        currentValue = -1;

        while (index < allowedValues.length && currentValue < 0){
            if (allowedValues[index].equals(iVal)){
                currentValue = index;
            }
            index = index + 1;
        }
        if (currentValue<0) {
            currentValue = previousValue;
        }
    }

}
