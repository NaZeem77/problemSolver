/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domains.farmer;
import  java.util.Objects;
import com.example.framework.problem.State;

/**
 *
 * @author Nathan Alemayehu
 */
public class FarmerState extends State {
    
    
    public FarmerState(String fState, String wState, String gState, String cState ) {
        this.fState = fState;
        this.wState = wState;
        this.gState = gState;
        this.cState = cState;
    }
    
    @Override
    public boolean equals(Object other) {
        if(other == null){
            return false;
        }
//        boolean eq = false;
//        FarmerState FotherState = (FarmerState) other;
//        if (this.fState.equals(FotherState.fState)& 
//               this.wState.equals(FotherState.wState) & 
//                this.gState.equals(FotherState.gState) &
//                this.cState.equals(FotherState.cState)) {
//            eq = true;
//        }
        return this.toString().equals( ((FarmerState) other).toString() );  // efficient 
        //return eq;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.fState);
        hash = 89 * hash + Objects.hashCode(this.wState);
        hash = 89 * hash + Objects.hashCode(this.gState);
        hash = 89 * hash + Objects.hashCode(this.cState);
        hash = 89 * hash + Objects.hashCode(this.fLine);
        hash = 89 * hash + Objects.hashCode(this.eLine);
        return hash;
    }
    
    @Override
    public String toString() {
          String retState = "   |  |   \n"; 
        
        if (this.fState.equalsIgnoreCase("West")) {
            retState += " F |  |   \n";
        }
        else retState += "   |  | F \n";
        
        if (this.wState.equalsIgnoreCase("West")) {
             retState += " W |  |   \n";
        }
        else retState += "   |  | W \n";
        
        if (this.gState.equalsIgnoreCase("West")) {
            retState += " G |  |   \n";
        }
        else retState += "   |  | G \n";
        
        if (this.cState.equalsIgnoreCase("West")) {
            retState += " C |  |   \n";
        }
        else retState += "   |  | C \n";
        retState += "   |  |   ";
//        System.out.print(fLine);          // This series of prints are to check
//        System.out.print(fState);         // The output of the FarmerStates
//        System.out.print(wState);
//        System.out.print(gState);
//        System.out.print(cState);
//        System.out.print(eLine);
//        System.out.print("\n");
//        System.out.print("\n");
//        System.out.print(retState);  
        return  retState;
        
        }

    private String fState;
    private String wState;
    private String gState;
    private String cState;
    private String fLine = "   |  |   \n";
    private String eLine = "   |  |   ";
    //Function used to get the position(East or West) of the Farmer, Wolf, Goat, and Cabbage
    //Used primarily in the FarmerMover class
    public String[] getPos() { 
        String[] f = {fState, wState, gState, cState};
        return f;
    }
}