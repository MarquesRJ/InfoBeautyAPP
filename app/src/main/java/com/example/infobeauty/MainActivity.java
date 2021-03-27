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

    public void telaCadastro(View view){

        Intent intent = new Intent(this, CadastroUsuario.class);
        startActivity(intent);
    }

    public void telaLogin(View view){

        Intent intent = new Intent(this, LoginUsuario.class);
        startActivity(intent);
    }
}