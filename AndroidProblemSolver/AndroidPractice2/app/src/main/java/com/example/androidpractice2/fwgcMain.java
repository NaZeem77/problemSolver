package com.example.androidpractice2;

import androidx.appcompat.app.AppCompatActivity;

import com.example.domains.farmer.FarmerMover;
import com.example.domains.farmer.FarmerProblem;
import com.example.framework.problem.State;
import com.example.framework.solution.SolvingAssistant;
import com.example.framework.solution.AStarSolver;
import com.example.framework.graph.Vertex;
import com.example.framework.solution.Solution;
import com.example.framework.solution.Statistics;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fwgcMain extends AppCompatActivity {
    FarmerProblem problem;
    TextView startView;
    TextView finalView;
    TextView congratView;
    TextView moveCount;
    TextView mLegal;
    SolvingAssistant solvy;
    AStarSolver solver;
    Solution solution;
    Statistics stats;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        problem = new FarmerProblem();
        solvy = new SolvingAssistant(problem);
        solver = new AStarSolver(problem);
        stats = new Statistics();
        setContentView(R.layout.activity_fwgc_main);
        startView = (TextView) findViewById(R.id.puzzle_solve_start);
        finalView = (TextView) findViewById(R.id.puzzle_solve_final);
        moveCount = (TextView) findViewById(R.id.moveCounter);
        congratView = (TextView) findViewById(R.id.congrat);
        mLegal = (TextView) findViewById(R.id.mLegal);
        moveCount.setText(String.valueOf(solvy.getMoveCount()));
        startView.setText(problem.getCurrentState().toString());
        finalView.setText(problem.getFinalState().toString());
    }


    public void farmerAlone(View v) {
        Button aloneButton = (Button) findViewById(R.id.farmer);
        solvy.tryMove( ( (FarmerMover) problem.getMover() ).ALONE);
        if(solvy.isMoveLegal()) {
            startView.setText(problem.getCurrentState().toString());
            moveCount.setText(String.valueOf(solvy.getMoveCount()));
            mLegal.setText("");
        }
        else if (!solvy.isMoveLegal()) {
            mLegal.setText("Illegal Move");
        }

    }

    public void wolf(View v) {
        Button aloneButton = (Button) findViewById(R.id.wolf);
        solvy.tryMove(((FarmerMover) problem.getMover()).WOLFTAKE);
        startView.setText(problem.getCurrentState().toString());
        moveCount.setText(String.valueOf(solvy.getMoveCount()));
        if(solvy.isMoveLegal()) {
            startView.setText(problem.getCurrentState().toString());
            moveCount.setText(String.valueOf(solvy.getMoveCount()));
            mLegal.setText("");
        }
        else if (!solvy.isMoveLegal()) {
            mLegal.setText("Illegal Move");
        }
    }

    public void daGoat(View v) {
        Button daGoatButton = (Button) findViewById(R.id.goat);
        solvy.tryMove(((FarmerMover) problem.getMover()).GOATTAKE);
        startView.setText(problem.getCurrentState().toString());
        moveCount.setText(String.valueOf(solvy.getMoveCount()));
        if(solvy.isMoveLegal()) {
            startView.setText(problem.getCurrentState().toString());
            moveCount.setText(String.valueOf(solvy.getMoveCount()));
            mLegal.setText("");
        }
        else if (!solvy.isMoveLegal()) {
            mLegal.setText("Illegal Move");
        }
        if(solvy.isProblemSolved()) {
            congratView.setText("Congrats! Problem Solved");
        }
    }

    public void cabbage(View v) {
        Button aloneButton = (Button) findViewById(R.id.cabbage);
        solvy.tryMove(((FarmerMover) problem.getMover()).CABBAGETAKE);
        startView.setText(problem.getCurrentState().toString());
        moveCount.setText(String.valueOf(solvy.getMoveCount()));
        if(solvy.isMoveLegal()) {
            startView.setText(problem.getCurrentState().toString());
            moveCount.setText(String.valueOf(solvy.getMoveCount()));
            mLegal.setText("");
        }
        else if (!solvy.isMoveLegal()) {
            mLegal.setText("Illegal Move");
        }
    }

    public void reset(View v) {
        Button resetButton = (Button) findViewById(R.id.reset);
            solvy.reset();
            congratView.setText("");
            startView.setText(problem.getCurrentState().toString());
            moveCount.setText(String.valueOf(solvy.getMoveCount()));
            mLegal.setText("");
    }

    public void solve(View V) {
        Button solveButton = (Button) findViewById(R.id.solve);
        solver.solve();
    }

}