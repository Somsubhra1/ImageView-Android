package com.somsubhra.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView;
    private Button button;

    private int current_Image_Index;
    private int images[] = {R.mipmap.and_image1, R.mipmap.and_image2, R.mipmap.and_image3}; // selecting images

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //linking components:

        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button);

        //setting click listener:

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        current_Image_Index++;
        if (current_Image_Index == images.length ) {
            current_Image_Index = 0;
        }
        imageView.setImageResource(images[current_Image_Index]); // setting image on pressing button
    }
}
