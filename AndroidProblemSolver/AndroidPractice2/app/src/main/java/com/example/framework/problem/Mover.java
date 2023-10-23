package com.example.framework.problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;

/**
 * This abstract class represents the moves in a problem solving domain.
 * It collects the available move names and associated functions
 * that attempt to create new states as a result of making moves.
 * This class is intended to be extended by classes that specify move
 * names and functions by calling the <b>addMove</b> method.
 * @author tcolburn
 */
public abstract class Mover {

    /**
     * Constructs a new Mover object for a problem solving domain.
     */
    public Mover() {
        moveNames = new ArrayList<>();
        moveMap = new HashMap<>();
    }
    
    /**
     * Adds a move name and associated move function to this Mover object.
     * @param moveName a move name
     * @param function a move function associated with the move name.
     * This function is an implementation of the UnaryOperator&lt;T&gt; functional
     * interface. It takes a state object as argument and, if the named move can be
     * made in that state, a new state is returned that is the result of the
     * move.  If the move cannot be made, null is returned.
     */
    public void addMove(String moveName, UnaryOperator<State> function) {
        moveNames.add(moveName);
        moveMap.put(moveName, function);
    }

    /**
     * Getter for the valid move names for a problem solving domain.
     * @return a list of valid move names
     */
    public List<String> getMoveNames() {
        return moveNames;
    }
    
    /**
     * Attempts to perform a move with a given name on a given state.
     * @param moveName name of the move to be performed.
     * If the name is not valid, a RuntimeException is thrown.
     * If the name is valid but cannot be performed in the given state,
     * null is returned.
     * If the move can be performed, the move name is stored in the
     * resulting state.
     * @param state the state on which to perform the named move
     * @return the result of applying the move name's associated
     * function on the given state
     */
    public State doMove(String moveName, State state) {
        //System.out.println("start doMove");
        UnaryOperator<State> function = moveMap.get(moveName);
        //System.out.println("set function doMove");
        if ( function == null ) {
            //System.out.println("first if doMove");
            throw new RuntimeException("Bad move name: " + moveName);
        }
        //System.out.println("middle doMove");
        
        State next = function.apply(state);
        if (next != null) {
            //System.out.println("second ifs doMove");
            next.setMove(moveName);
        }
        //System.out.println("Fin do move");
        return next;
    }
    
    private final List<String> moveNames;
    private final Map<String, UnaryOperator<State>> moveMap;
    
}