package com.example.androidpractice2;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.example.domains.puzzle.PuzzleMover;
import com.example.domains.puzzle.PuzzleProblem;
import com.example.framework.solution.SolvingAssistant;

public class puzzleMain extends AppCompatActivity {
    PuzzleProblem problem;
    TextView startView;
    TextView finalView;
    TextView congratView;
    TextView moveCount;
    TextView mLegal;
    SolvingAssistant solvy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle_main);
        problem = new PuzzleProblem();
        solvy = new SolvingAssistant(problem);
        startView = (TextView) findViewById(R.id.puzzle_solve_start);
        finalView = (TextView) findViewById(R.id.puzzle_solve_final);
        congratView = (TextView) findViewById(R.id.pCongrat);
        moveCount = (TextView) findViewById(R.id.moveCounter);
        mLegal = (TextView) findViewById(R.id.pLegal);
        startView.setText(problem.getCurrentState().toString());
        moveCount.setText(String.valueOf(solvy.getMoveCount()));
        finalView.setText(problem.getFinalState().toString());
    }


    public void slide1(View v) {
        Button aloneButton = (Button) findViewById(R.id.farmer);
        solvy.tryMove( ( (PuzzleMover) problem.getMover() ).tile1);
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
        if(solvy.isProblemSolved()){
            congratView.setText("Congrats! Problem Solved");
        }
    }

    public void slide2(View v) {
        Button aloneButton = (Button) findViewById(R.id.wolf);
        solvy.tryMove( ( (PuzzleMover) problem.getMover() ).tile2);
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
        if(solvy.isProblemSolved()){
            congratView.setText("Congrats! Problem Solved");
        }
    }

    public void slide3(View v) {
        Button aloneButton = (Button) findViewById(R.id.goat);
        solvy.tryMove( ( (PuzzleMover) problem.getMover() ).tile3);
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
        if(solvy.isProblemSolved()){
            congratView.setText("Congrats! Problem Solved");
        }
    }

    public void slide4(View v) {
        Button aloneButton = (Button) findViewById(R.id.cabbage);
        solvy.tryMove( ( (PuzzleMover) problem.getMover() ).tile4);
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
        if(solvy.isProblemSolved()){
            congratView.setText("Congrats! Problem Solved");
        }
    }

    public void slide5(View v) {
        Button aloneButton = (Button) findViewById(R.id.slide5);
        solvy.tryMove( ( (PuzzleMover) problem.getMover() ).tile5);
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
        if(solvy.isProblemSolved()){
            congratView.setText("Congrats! Problem Solved");
        }
    }

    public void slide6(View v) {
        Button aloneButton = (Button) findViewById(R.id.slide6);
        solvy.tryMove( ( (PuzzleMover) problem.getMover() ).tile6);
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
        if(solvy.isProblemSolved()){
            congratView.setText("Congrats! Problem Solved");
        }
    }

    public void slide7(View v) {
        Button aloneButton = (Button) findViewById(R.id.slide7);
        solvy.tryMove( ( (PuzzleMover) problem.getMover() ).tile7);
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
        if(solvy.isProblemSolved()){
            congratView.setText("Congrats! Problem Solved");
        }
    }

    public void slide8(View v) {
        Button aloneButton = (Button) findViewById(R.id.slide8);
        solvy.tryMove( ( (PuzzleMover) problem.getMover() ).tile8);
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
        if(solvy.isProblemSolved()){
            congratView.setText("Congrats! Problem Solved");
        }
    }

    public void reset(View v) {
        Button resetButton = (Button) findViewById(R.id.reset);
        solvy.reset();
        startView.setText(problem.getCurrentState().toString());
        moveCount.setText(String.valueOf(solvy.getMoveCount()));
        congratView.setText("");
        mLegal.setText("");
    }



}