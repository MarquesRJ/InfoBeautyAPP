package com.example.infobeauty;

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

    public void telaIndexUsuario(View view){

        Intent intent = new Intent(this, IndexUsuario.class);
        startActivity(intent);
    }

    public void telaIndexEmpresa(View view){

        Intent intent = new Intent(this, IndexEmpresa.class);
        startActivity(intent);
    }
}