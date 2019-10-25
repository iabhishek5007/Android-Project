package com.example.rating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.trafi.ratingseekbar.RatingSeekBar;

public class MainActivity extends AppCompatActivity implements RatingSeekBar.OnRatingSeekBarChangeListener{

SeekBar seekBar;
TextView review;
ImageView imageView;
    TextView ratingLabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        ((RatingSeekBar) findViewById(R.id.rating_seek_bar_one)).setOnSeekBarChangeListener(this);
        ratingLabel = (TextView) findViewById(R.id.label);
        imageView= (ImageView)findViewById(R.id.imageView2);
    }
    @Override
    public void onProgressChanged(RatingSeekBar ratingSeekBar, int progress){

        if (progress==1){
            ratingLabel.setText("Terrible");
            imageView.setImageResource(R.drawable.ic_nps1);
        }
        if (progress==2){
            ratingLabel.setText("Bad");
            imageView.setImageResource(R.drawable.ic_nps2);
          //  imageView.setImageResource(getResources().getDrawable(R.drawable.face0));
        }
        if (progress==3){
            ratingLabel.setText("UnHappy");
            imageView.setImageResource(R.drawable.ic_nps3);
        }
        if (progress==4){
            ratingLabel.setText("Not Too Happy");
            imageView.setImageResource(R.drawable.ic_nps4);
        }
        if (progress==5){
            ratingLabel.setText("Preety Happy");
            imageView.setImageResource(R.drawable.ic_nps5);
        }
        if (progress==6){
            ratingLabel.setText("Very Happy");
            imageView.setImageResource(R.drawable.ic_nps6);
        }
        if (progress==7){
            ratingLabel.setText("Too Much Happy");
            imageView.setImageResource(R.drawable.ic_nps7);
        }
        if (progress==8){
            ratingLabel.setText("Excellent");
            imageView.setImageResource(R.drawable.ic_nps8);
        }
        if (progress==9){
            ratingLabel.setText("Excellent 2");
            imageView.setImageResource(R.drawable.ic_nps9);
        }
        if (progress==10){
            ratingLabel.setText("Awesome");
            imageView.setImageResource(R.drawable.ic_nps10);
        }
      //  ratingLabel.setText("Rating " + progress);
       // switch ((int) ratingSeekBar.OnRatingSeekBarChangeListener
        //ratingLabel.setText("Rating " + progress + " / " + ratingSeekBar.getMax());
    }

    }