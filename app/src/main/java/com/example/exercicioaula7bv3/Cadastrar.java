package com.example.exercicioaula7bv3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.example.exercicioaula7bv3.model.*;

public class Cadastrar extends AppCompatActivity {

    private ArrayListAlunos base = new ArrayListAlunos();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

    }

    public void salvarDados(View v){


    String nome = ((EditText)findViewById(R.id.editNome)).getText().toString();
    String rgm = ((EditText)findViewById(R.id.editRgm)).getText().toString();
    Float np = Float.parseFloat(((EditText)findViewById(R.id.editParcial)).getText().toString());
    Float nt = Float.parseFloat(((EditText)findViewById(R.id.editTrabalhos)).getText().toString());
    Float nr = Float.parseFloat(((EditText)findViewById(R.id.editPri)).getText().toString());

    if(base.insert(new Aluno (rgm, nome, np, nt, nr))){
     Toast.makeText(getApplicationContext(), "Dados gravados", Toast.LENGTH_LONG).show();

    }

    }

}
