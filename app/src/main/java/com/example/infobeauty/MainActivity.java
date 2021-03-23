package com.example.infobeauty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void telaCadastro(View view){

        Intent intent = new Intent(this, Cadastro.class);
        startActivity(intent);
    }

    public void telaLogin(View view){

        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}