package com.akshaytech.workoutadvisor;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    Spinner spinner;
    String workout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textView = findViewById(R.id.workoutlist);
        spinner = findViewById(R.id.workouttype);
        button = findViewById(R.id.Findworkout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.bounce);
                button.startAnimation(animation);
                workout = String.valueOf(spinner.getSelectedItem());
                if(workout.equals("Chest"))
                    textView.setText("Bench press\n" + "Dips");
                else if(workout.equals("Back"))
                    textView.setText("Deadlifts\n" + "Pull-ups/ Chin-ups");
                else if(workout.equals("Biceps"))
                    textView.setText("Close grip pull-up\n" + "Dumbbell curl\n");
                else if(workout.equals("Triceps"))
                    textView.setText("Reverse grip/close grip bench press\n" + "Dips");
                else if(workout.equals("Abs"))
                    textView.setText("Sit-ups\n" + "Pull-ups\n" + "Squats");
                else if(workout.equals("Shoulders"))
                    textView.setText("Overhead press");
                else if(workout.equals("Legs"))
                    textView.setText("Squats\n" + "Deadlifts");
                else if(workout.equals("Calves"))
                    textView.setText("Jump rope\n" + "Dumbbell jump squat");
            }
        });

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
