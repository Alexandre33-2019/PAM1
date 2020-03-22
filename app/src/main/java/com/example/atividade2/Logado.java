package com.example.atividade2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Logado extends AppCompatActivity {

    Intent it = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logado);
    }

    /*MÉTODO QUE TRATA A INTENT DO BOTÃO SAIR:*/
    public void Sair (View v) {

        this.it = new Intent(Logado.this, MainActivity.class);
        startActivity(this.it);
    }
}
