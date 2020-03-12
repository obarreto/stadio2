package com.example.stadio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrirPalmeiras(View view){
        // Envia uma ação para o Android como chamar a camera ou outra Activity
        Intent it = new Intent(this,PalmeiraActivity.class);
        startActivity(it);
    }

    public void abrirCurintia(View view){
        // Envia uma ação para o Android como chamar a camera ou outra Activity
        Intent it = new Intent(this,CurintiaActivity.class);
        startActivity(it);
    }

    public void abrirPeixe(View view){
        // Envia uma ação para o Android como chamar a camera ou outra Activity
        Intent it = new Intent(this,PeixeActivity.class);
        startActivity(it);
    }

    public void abrirTricolor(View view){
        // Envia uma ação para o Android como chamar a camera ou outra Activity
        Intent it = new Intent(this,TricolorActivity.class);
        startActivity(it);
    }
}
