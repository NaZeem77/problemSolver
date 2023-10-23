/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domains.puzzle;

import com.example.framework.problem.Problem;

/**
 *
 * @author Nathan Alemayehu
 */
public class PuzzleProblem extends Problem {
    public PuzzleProblem() {
        super();
        finalState = new PuzzleState(new int[][]{new int[]{1,2,3}, new int[]{8,0,4}, new int[]{7,6,5}});
        super.setName("8-Puzzle");
        super.setIntroduction(INTRO + finalState.toString());
        super.setMover(new PuzzleMover());
        super.setInitialState(new PuzzleState(new int[][]{new int[]{2,8,3}, new int[]{1,6,4}, new int[]{7,0,5}}));
        super.setCurrentState(super.getInitialState());
        super.setFinalState(finalState);
        
    }
    private final PuzzleState finalState;
    private static final String INTRO = "You are given a board in which numbered\n"
+ "tiles can slide around. There is one blank space that holds no \n"
+ "tile.  A legal move consists of sliding a tile into the blank \n"
+ "space if the tile is adjacent to it. The goal is to move tiles \n"
+ "around until the board looks like the final state below.\n\n";
}
