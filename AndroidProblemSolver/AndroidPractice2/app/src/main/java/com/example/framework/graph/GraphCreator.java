package com.example.framework.graph;

import com.example.framework.problem.Problem;
import com.example.framework.problem.State;
import java.util.List;
import java.util.Stack;

/**
 * @author Nathan Alemayehu
 */
public class GraphCreator {
    
    public Graph createGraphFor(Problem problem) {
        //System.out.println("Start graph create");
        graph = new Graph();
        // You must provide
        daStack = new Stack();
        daStart = new Vertex(problem.getInitialState());
        daStack.push(daStart);
        m = problem.getMover().getMoveNames();
        //System.out.println("Start While Loop");
        while(!daStack.empty()) {
          u = daStack.pop();
          //System.out.println("Start for loop");
          for(String i: m) {
              //System.out.println(m);
              daNext = problem.getMover().doMove(i, (State) u.getData());
              //System.out.println("Start if");
              if (daNext != null) {
                  //System.out.println("in if");
                  vertex = new Vertex(daNext);
                  if (graph.getVertices().containsKey(vertex)) 
                      graph.getVertices().get(vertex);
                  else{
                      daStack.push(vertex);
                  }
                  graph.addEdge(u, vertex);
                      
              }
          }
        }
        //System.out.println("End graph create");
        return graph;
    }

            
    private Graph graph = null;
    private Stack<Vertex> daStack;
    private Vertex daStart;
    private Vertex vertex;
    private Vertex u;
    private List<String> m; // List of moves
    private State daNext;
}