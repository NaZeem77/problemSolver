/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domains.farmer;

import com.example.framework.graph.Vertex;
import com.example.framework.graph.Graph;
/**
 *
 * @author Nathan Alemayehu
 */
public class FarmerGraph extends Graph{
    Vertex tex1 = new Vertex(new FarmerState("West", "West", "West", "West"));
    Vertex tex2 = new Vertex(new FarmerState("West", "East", "West", "East"));
    Vertex tex3 = new Vertex(new FarmerState("West", "East", "West", "West"));
    Vertex tex4 = new Vertex(new FarmerState("West", "West", "East", "West"));
    Vertex tex5 = new Vertex(new FarmerState("West", "West", "West", "East"));
    Vertex tex6 = new Vertex(new FarmerState("East", "East", "East", "East"));
    Vertex tex7 = new Vertex(new FarmerState("East", "West", "East", "West"));
    Vertex tex8 = new Vertex(new FarmerState("East", "West", "East", "East"));
    Vertex tex9 = new Vertex(new FarmerState("East", "East", "West", "East"));
    Vertex tex10 = new Vertex(new FarmerState("East", "East", "East", "West"));
    
    public FarmerGraph() {
        super.addEdge(tex1, tex7);
        super.addEdge(tex7, tex1);
        super.addEdge(tex7, tex4);
        super.addEdge(tex4, tex7);
        super.addEdge(tex4, tex10);
        super.addEdge(tex4, tex8);
        super.addEdge(tex10, tex4);
        super.addEdge(tex8, tex4);
        super.addEdge(tex10, tex3);
        super.addEdge(tex3, tex10);
        super.addEdge(tex8, tex5);
        super.addEdge(tex5, tex8);
        super.addEdge(tex3, tex9);
        super.addEdge(tex9, tex3);
        super.addEdge(tex5, tex9);
        super.addEdge(tex9, tex5);
        super.addEdge(tex9, tex2);
        super.addEdge(tex2, tex9);
        super.addEdge(tex2, tex6);
        super.addEdge(tex6, tex2);
        daStart = tex1;  // Sets the starting spot to Vertex 1
        TheeEnd = tex6;  // Sets the ending spot to Vertex 6
    }
    
    //simply returns the start
    public Vertex getDaStart() {
        return daStart;
    }
    
    //simply returns the end
    public Vertex getTheeEnd() {
        return TheeEnd;
    }
    
    //Private Instance Field
    private Vertex daStart;
    private Vertex TheeEnd;
}
