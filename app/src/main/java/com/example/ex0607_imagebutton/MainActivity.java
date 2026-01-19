package com.example.ex0607_imagebutton;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.ex0607_imagebutton.R;

import java.util.Random;




public class MainActivity extends AppCompatActivity {
     ImageView iVMAIN;
    Random rand = new Random();

    ImageButton ib;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iVMAIN = findViewById(R.id.iVMAIN);
        ib=findViewById(R.id.ib);


    }

    public void clicked(View view) {
        int random = rand.nextInt(3) + 1;
        if(random==1) {
            iVMAIN.setImageResource(R.drawable.squirtle);
            ib.setImageResource(R.drawable.one);
        }
        else if(random == 2) {
            iVMAIN.setImageResource(R.drawable.bulbasaur);
            ib.setImageResource(R.drawable.two);
        }
        else if(random == 3) {
            iVMAIN.setImageResource(R.drawable.charmander);
            ib.setImageResource(R.drawable.three);

        }



    }
}
