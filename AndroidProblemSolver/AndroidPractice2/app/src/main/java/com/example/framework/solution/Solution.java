package com.example.framework.solution;

import com.example.framework.graph.Vertex;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author Nathan Alemayehu
 */
public class Solution implements Iterator<Vertex> {
    
    /**
     * Creates an object that represents a path from a start
     * vertex to an end vertex in a problem solving domain.
     * This constructor will be called after a search has been
     * initiated on the start vertex.
     * If a path from start to end exists, it can be constructed
     * from the predecessor information stored in the end vertex.
     * @param start the start vertex
     * @param end the end vertex
     */
    public Solution(Vertex start, Vertex end) {
        // You must provide
        // 
        daStack = new Stack();  // Create new stack
        Vertex curTex = end;
        
        daStack.push(end);     // Push end onto the stack to start it out with end
        while(!curTex.equals(start)) {
            curTex = curTex.getPredecessor();
            daStack.push(curTex);
        }
    }

    /**
     * Gets the length of the solution.
     * This is the number of moves in the solution, not the
     * number of vertices.
     * @return the solution length
     */
    public int getLength() {
        // You must provide
        
        return daStack.size()-1;
    }
    
    /**
     * Checks whether there are more vertices in this solution.
     * @return true if there are more vertices in this solution, false
     * otherwise
     */
    @Override
    public boolean hasNext() {
        // You must provide
        // probably could have done this in one line
        boolean nextOrNo = !daStack.isEmpty();
        return nextOrNo;
    }
    
    /**
     * Removes and returns the next vertex in this solution.
     * @return the next vertex in this solution
     * @throws RuntimeException if there are no more vertices
     */
    @Override
    public Vertex next() {
        // You must provide
        Vertex goNext = (Vertex) daStack.peek();
        daStack.pop();
        
        return goNext;
    }
    
    // Private instance fields here
    private final Stack daStack;
}