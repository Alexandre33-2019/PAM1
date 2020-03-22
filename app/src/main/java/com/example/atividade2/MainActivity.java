package com.example.atividade2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Intent it = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*MÉTODO QUE TRATA A INTENT DO BOTÃO LOGAR:*/
    public void Logado (View v) {

        /*CRIANDO OS OBJETOS*/
        final EditText txtUsuario = findViewById(R.id.entradaLogin);
        final EditText txtSenha = findViewById(R.id.entradaSenha);


        if(txtUsuario.getText().toString().equals("admin") && txtSenha.getText().toString().equals("1234")){
            /*IF seja admin e senha 1234 levar para tela de logado*/
            this.it = new Intent(MainActivity.this, Logado.class);
            startActivity(this.it);
        }
        else {
            /*Else apareça o erro*/
            Toast errorToast = Toast.makeText(MainActivity.this, "Usuário não cadastrado", Toast.LENGTH_SHORT);
            errorToast.show();
        }


    }

}
