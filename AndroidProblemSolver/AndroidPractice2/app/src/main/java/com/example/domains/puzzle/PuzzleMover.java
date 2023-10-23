/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domains.puzzle;

import com.example.domains.puzzle.PuzzleState.Location;
import com.example.framework.problem.Mover;
import com.example.framework.problem.State;


/**
 *
 * @author Nathan Alemayehu
 */
public class PuzzleMover extends Mover {
    public static final String tile1 = "Slide Tile 1";
    public static final String tile2 = "Slide Tile 2";
    public static final String tile3 = "Slide Tile 3";
    public static final String tile4 = "Slide Tile 4";
    public static final String tile5 = "Slide Tile 5";
    public static final String tile6 = "Slide Tile 6";
    public static final String tile7 = "Slide Tile 7";
    public static final String tile8 = "Slide Tile 8";
    
    public PuzzleMover() {
        addMove(tile1, s -> tile1(s));
        addMove(tile2, s -> tile2(s));
        addMove(tile3, s -> tile3(s));
        addMove(tile4, s -> tile4(s));
        addMove(tile5, s -> tile5(s));
        addMove(tile6, s -> tile6(s));
        addMove(tile7, s -> tile7(s));
        addMove(tile8, s -> tile8(s));
    }
    // Each tile function deals with the movement of each numbered tile
    //they all take in an object of type State
    private State tile1(State daState) {
        PuzzleState pState = (PuzzleState) daState;
        Location l1 = pState.getLocation(1);
        Location l2 = pState.getLocation(0);
        if(yuh(l1,l2)) {
            System.out.println("success");
            return new PuzzleState(pState, l1, l2);
        }
        return null;
    }
    
    private State tile2(State daState) {
        PuzzleState pState = (PuzzleState) daState;
        Location l1 = pState.getLocation(2);
        Location l2 = pState.getLocation(0);
        if(yuh(l1, l2)) {
            return new PuzzleState(pState, l1, l2);
        }
        return null;
    }
    
    private State tile3(State daState) {
        PuzzleState pState = (PuzzleState) daState;
        Location l1 = pState.getLocation(3);
        Location l2 = pState.getLocation(0);
        if(yuh(l1, l2)) {
            return new PuzzleState(pState, l1, l2);
        }
        return null;
    }
    
    private State tile4(State daState) {
        PuzzleState pState = (PuzzleState) daState;
        Location l1 = pState.getLocation(4);
        Location l2 = pState.getLocation(0);
        if(yuh(l1, l2)) {
            return new PuzzleState(pState, l1, l2);
        }
        return null;
    }
    
    private State tile5(State daState) {
        PuzzleState pState = (PuzzleState) daState;
        Location l1 = pState.getLocation(5);
        Location l2 = pState.getLocation(0);
        if(yuh(l1, l2)) {
            return new PuzzleState(pState, l1, l2);
        }
        return null;
    }
    
    private State tile6(State daState) {
        PuzzleState pState = (PuzzleState) daState;
        Location l1 = pState.getLocation(6);
        Location l2 = pState.getLocation(0);
        if(yuh(l1, l2)) {
            return new PuzzleState(pState, l1, l2);
        }
        return null;
    }
    
    private State tile7(State daState) {
        PuzzleState pState = (PuzzleState) daState;
        Location l1 = pState.getLocation(7);
        Location l2 = pState.getLocation(0);
        if(yuh(l1, l2)) {
            return new PuzzleState(pState, l1, l2);
        }
        return null;
    }
    
    private State tile8(State daState) {
        PuzzleState pState = (PuzzleState) daState;
        Location l1 = pState.getLocation(8);
        Location l2 = pState.getLocation(0);
        if(yuh(l1, l2)) {
            return new PuzzleState(pState, l1, l2);
        }
        return null;
    }
    
    private boolean yuh(Location tLoc, Location blankTileLoc) {  // checks whether the move is valid or invalid
        if(((tLoc.getColumn()-1 == blankTileLoc.getColumn() || tLoc.getColumn() +1 == blankTileLoc.getColumn())
                && (tLoc.getRow() == blankTileLoc.getRow()))
                || ((tLoc.getRow()-1 == blankTileLoc.getRow()
                || tLoc.getRow()+1 == blankTileLoc.getRow())
                && tLoc.getColumn() == blankTileLoc.getColumn())) {
            return true;
        }
        else {
            return false;
        }
    }
}
