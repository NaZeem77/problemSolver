/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domains.farmer;

import com.example.framework.problem.Mover;
import com.example.framework.problem.State;

/**
 *
 * @author Nathan Alemayehu 
 */
public class FarmerMover extends Mover{
    public static final String ALONE = "Farmer Goes Alone";
    public static final String WOLFTAKE = "Farmer Takes Wolf";
    public static final String GOATTAKE = "Farmer Takes Goat";
    public static final String CABBAGETAKE = "Farmer Takes Cabbage";
    
    public FarmerMover() {
        super.addMove(ALONE, s -> aLone(s));
        super.addMove(WOLFTAKE, s -> wolfTake(s));
        super.addMove(GOATTAKE, s -> goatTake(s));
        super.addMove(CABBAGETAKE, s -> cabbageTake(s));
    }
    
    // Boolean function that determines if a state or move is valid
    private boolean bigNoNo(State daState) {
        String[] daPos = getPrevPos(daState);
        boolean NO = (daPos[1] == daPos[2] && daPos[1] != daPos[0]) || (daPos[2] == daPos[3] && daPos[2] != daPos[0]);
        return NO;
    }
    
    // Function that facilitates the moving of the States/animals and farmer
    private String move(String daState) {
        if (daState == "West") {
            return "East"; }
        else if (daState == "East") {
            return "West"; }
        return "";
    }
    
    // function to find the previous state 
    private String[] getPrevPos(State daState) {
        FarmerState mooState = (FarmerState) daState;
        return mooState.getPos();
    }
    
    private State aLone(State daState) {
        String[] daPos = getPrevPos(daState);
        FarmerState aFstate = new FarmerState(move(daPos[0]), daPos[1], daPos[2], daPos[3]);
        if(bigNoNo(aFstate)) { return null; }
        return aFstate;
    }
    
    private State wolfTake(State daState) {
        String[] daPos = getPrevPos(daState);
        FarmerState mooState = new FarmerState(move(daPos[0]), move(daPos[1]), daPos[2], daPos[3]);
        if (bigNoNo(mooState)) { return null; }
            return mooState;
        }
    
    private State goatTake(State daState) {
        String[] daPos = getPrevPos(daState);
        FarmerState mooState = new FarmerState(move(daPos[0]), daPos[1], move(daPos[2]), daPos[3]);
        if (bigNoNo(mooState)) { return null; }
        return mooState;
        }
    
    private State cabbageTake(State daState) {
        String[] daPos = getPrevPos(daState);
        FarmerState mooState = new FarmerState(move(daPos[0]), daPos[1], daPos[2], move(daPos[3]));
        if(bigNoNo(mooState)) { return null; }
        return mooState;    
    }
    
    
    }
    

