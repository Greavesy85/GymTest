package com.binlid.gymlogger;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ExcerciseInfoPage extends AppCompatActivity {

    exercise Exercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excersice_info_page);

        final ImageView image = (ImageView) findViewById(R.id.imageView);
        final TextView textBox = (TextView) findViewById(R.id.textView);

        Exercise = (exercise)getIntent().getSerializableExtra("exer");

        //if(exer.equals("curl"))
        image.setBackgroundResource(getResources().getIdentifier(Exercise.ImageName, "drawable", getPackageName()));
        textBox.setText(Exercise.Desc);

        buttonPress();

    }

    public void buttonPress()
    {

        final ImageView image = (ImageView) findViewById(R.id.imageView);
        Button changeTextButton = (Button) findViewById(R.id.testButton);

        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                image.setBackgroundResource(R.drawable.bcurl);

                

            }
        });


    }

}
