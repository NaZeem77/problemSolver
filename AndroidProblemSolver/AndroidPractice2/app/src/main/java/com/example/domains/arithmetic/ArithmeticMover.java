package com.example.domains.arithmetic;

import com.example.framework.problem.Mover;
import com.example.framework.problem.State;

/**
 *
 * @author Nathan Alemayehu
 */
public class ArithmeticMover extends Mover {
    
    public static final String aThree = "Add 3";
    public static final String sFive = "Subtract 5";
    public static final String mTwo = "Multiply by 2";
    public static final String dTwo = "Divide by 2";
    
    // You must provide
    
    /*
    This function adds moves to mover class
    */
    public ArithmeticMover() {
        super.addMove(aThree, s -> tryThree(s));
        super.addMove(sFive, s -> tryFive(s));
        super.addMove(mTwo, s -> tryTwo(s));
        super.addMove(dTwo, s -> divTwo(s));
    }
   
    /*
    Funcion adds three to the current state
    @param current state 
    @return new state with addition of 3
    */
    private State tryThree(State state) {
        ArithmeticState s = (ArithmeticState) state;
        int newNum = ((ArithmeticState) state).getValue() + 3;
        ArithmeticState retState = new ArithmeticState(newNum);
        //String move = s.getMove();  //Does nothing for now
        return retState;
    }
    /*
    Function that subtracts five from current state 
    @param current state
    @return new state with subtraction of 5
    */
    private State tryFive(State state) {
        ArithmeticState s = (ArithmeticState) state;
        int newNum = ((ArithmeticState) state).getValue() - 5;
        ArithmeticState retState = new ArithmeticState(newNum);
        //String move = s.getMove();
        return retState;
    }
    /*
    Function that multiplies current state by two 
    @param current state
    @return new state with multiplication of 2
    */
    private State tryTwo(State state) {
        ArithmeticState s = (ArithmeticState) state;
        int newNum = ((ArithmeticState) state).getValue() * 2;
        ArithmeticState retState = new ArithmeticState(newNum);
        //String move = s.getMove();
        return retState;
    }
    
    /*
    Function that divides current state by 2
    @param current state
    @return new state with division of 2
    */
    private State divTwo(State state) {
        ArithmeticState s = (ArithmeticState) state;
        int newNum = ((ArithmeticState) state).getValue() / 2;
        ArithmeticState retState = new ArithmeticState(newNum);
        //String move = s.getMove();
        return retState;
    }
}
