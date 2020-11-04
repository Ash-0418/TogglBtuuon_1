package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    RatingBar r;
    TextView ta;
    ToggleButton tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb=(ToggleButton)findViewById(R.id.tb);
        r=(RatingBar)findViewById(R.id.r);
        r.setRating(3);//처음부터 setting된 별의 수
        r.setStepSize(1);//별의 증가 수
        ta=(TextView)findViewById(R.id.ta);
        r.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                ta.setText(""+r.getRating());
            }
        });


    }//onCreate

    public void show(View v){
        if(tb.isChecked()){
            ta.setText("ok");
        }else{
            ta.setText("ok");
        }
    }//show
}//class