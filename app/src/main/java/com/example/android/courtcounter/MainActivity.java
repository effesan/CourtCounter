package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Add 3 points to score for Team A.
     */
    public void addScore3forTeamA(View view) {

        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Add 2 points to score for Team A.
     */
    public void addScore2forTeamA(View view) {
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Add 1 point to score for Team A.
     */
    public void addScore1forTeamA(View view) {
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Add 3 points to score for Team A.
     */
    public void addScore3forTeamB(View view) {

        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Add 2 points to score for Team A.
     */
    public void addScore2forTeamB(View view) {
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Add 1 point to score for Team A.
     */
    public void addScore1forTeamB(View view) {
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }

    //resetScore
    public void resetScore(View view) {
        displayForTeamA(0);
        displayForTeamB(0);
        scoreTeamA=0;
        scoreTeamB=0;

    }

}
