package com.example.framework.solution;

import com.example.framework.graph.Vertex;
import com.example.framework.problem.Problem;
import com.example.framework.problem.State;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * This class represents an A* solver by extending the StateSpaceSolver
 * class.
 * @author Nathan Alemayehu 
 */
public class AStarSolver extends StateSpaceSolver {
    
    /**
     * Creates an A* solver.
     * This constructor should set the queue to a priority queue (PQ)
     * and set the statistics header.
     * @param problem 
     */
    public AStarSolver(Problem problem) {
        // you must provide
        super(problem);
        super.setQueue(new PriorityQueue<>());
//        daQ = new PriorityQueue<Vertex>();
        
    }
    
    Queue daQ;
}