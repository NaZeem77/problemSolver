package com.example.domains.arithmetic;

import com.example.framework.problem.Problem;


/**
 *
 * @author Nathan Alemaeyhu
 */
public class ArithmeticProblem extends Problem {
       // You must provide
    /*
    Initializes the problem and sets up the parameters such as the 
    starting state of the Arithmetic state and final state
    */
    public ArithmeticProblem() {
        super();
        super.setName("Arithmetic");
        super.setIntroduction(INTRO);
        super.setMover(new ArithmeticMover());
        super.setInitialState(new ArithmeticState(0));
        super.setCurrentState(super.getInitialState());
        super.setFinalState(new ArithmeticState(17));
    }
    
    private static final String INTRO =
            "The starting value is zero. " +
             "Your options are to add 3, subtract 5, " +
             "divide by 2, or multiply by 2. " +
             "Find a sequence of operations that results in the value 17.";
}
