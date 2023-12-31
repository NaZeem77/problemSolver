package com.example.framework.solution;

import com.example.framework.graph.Vertex;
import com.example.framework.problem.Problem;
import java.util.LinkedList;

/**
 * A problem solver that does a breadth-first search of
 * the problem state space.
 * @author tcolburn
 */
public class BFSStateSpaceSolver extends StateSpaceSolver {
    
    public BFSStateSpaceSolver(Problem problem) {
        super(problem);
        super.getStatistics().setHeader("Breadth-First Search");
    }
    
    @Override
    public void add(Vertex v) {
        ((LinkedList<Vertex>)getQueue()).addLast(v); // BFS
    }
    
}