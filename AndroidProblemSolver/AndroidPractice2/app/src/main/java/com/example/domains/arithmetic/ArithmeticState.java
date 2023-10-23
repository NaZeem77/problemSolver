package com.example.domains.arithmetic;
import  java.util.Objects;
import com.example.framework.problem.State;
import java.util.stream.Stream;

/**
 *
 * @author Nathan Alemayehu
 */
public class ArithmeticState extends State {
    
    /*
    constructor for the Arithmetic State
    @param value
    */
    public ArithmeticState(int value) {
        // You must provide
        this.value = value;
    }
    /*
    Takes in an other of type Object and determines
    whether if it is equal to value
    @param other object to be compared
    @return boolean returns true if equal, false if not
    */
    @Override
    public boolean equals(Object other) {
//<editor-fold>
//        boolean maths = false;
//        ArithmeticState otherA = (ArithmeticState) other;
//        if (this.value == (otherA.value)) {
//            maths = true;
//        }
//        return maths;
        
//        if(this.value.equals( (ArithmeticState) other)){
//            return true;
//        }
//     
//</editor-fold>
        
    return this.value.equals( ((ArithmeticState) other).getValue() ) ;
        
    }

    /*Converts integer(value) to string
    @return the string
    */
    @Override
    public String toString() {
        return "The value is: " + value.toString();
        
       
    }
    /* Function to retrieve value from state
    @return value
    */
    public int getValue() {
        return value;
    }

private final Integer value;
private static final String NEW_LINE = "\n";

}