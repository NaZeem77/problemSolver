package com.example.framework.solution;

import com.example.framework.graph.Vertex;
import com.example.framework.problem.Mover;
import com.example.framework.problem.Problem;
import com.example.framework.problem.State;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * This class represents a state space solver by extending the abstract
 * Solver class.
 * @author Your name and section here
 */
public abstract class StateSpaceSolver extends Solver {
    
    /**
     * Creates a BFS or DFS state space solver.
     * This constructor should set the queue to a double-ended queue 
     * (DEQUE) like the GraphSolver.
     * @param problem the problem being solved
     */
    public StateSpaceSolver(Problem problem) {
        super(problem);
        super.setQueue(new LinkedList<>());
        m = problem.getMover();
    }
    
    /**
     * This method implements the expand operation required by the 
     * state space search algorithm.
     * @param u the vertex being expanded
     * @return the children of u in the state space search tree
     * 
     * Search(s)
   for each u ∈ V[G]-{s} do
      open[u] = true
      d[u] = ∞ 
      pred[u] = null
   open[s] = false
   d[s] = 0
   pred[s] = null
   Q = {s}
   while Q ≠ {} do
      u = Remove[Q]
      for each v ∈ expand(u) do
         if open[v] = true
            then open[v] = false
                 d[v] = d[u] + 1
                 pred[v] = u
                 Add(Q,v)
     */
    @Override
    public List<Vertex> expand(Vertex u) { 
        // you must provide
        List<String> mNames = m.getMoveNames();
        Vertex v;
        aMoves = new ArrayList<Vertex>();
        for(String s: mNames) {
        v = new Vertex(m.doMove(s, (State) u.getData()));
        if(v.getData() != null) {
            aMoves.add(v);
        }
        
    }

    return aMoves;
    }
    
    private Mover m;
    List<Vertex> aMoves;
}