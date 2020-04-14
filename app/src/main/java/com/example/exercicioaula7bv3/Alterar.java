package com.example.exercicioaula7bv3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.exercicioaula7bv3.model.*;


public class Alterar extends AppCompatActivity {

    private ArrayListAlunos base = new ArrayListAlunos();
    private Aluno a  = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar);
    }

    public void consultarDados(View v){
        a = base.select(((EditText)findViewById(R.id.editRgm)).getText().toString());

        if( a != null){
            ((EditText)findViewById(R.id.editNome)).setText(a.getNome());
            ((EditText)findViewById(R.id.editParcial)).setText(a.getNota_parcial()+"");
            ((EditText)findViewById(R.id.editTrabalhos)).setText(a.getNota_trabs()+"");
            ((EditText)findViewById(R.id.editPri)).setText(a.getNota_reg()+"");

        } else {
            Toast.makeText(getApplicationContext(), "RGM inválido:", Toast.LENGTH_LONG).show();

        }
    }

    // método para alterar


    public void alterarDados(View v){

         a = base.select(((EditText)findViewById(R.id.editRgm)).getText().toString());

        if(a != null){
            String nome = ((EditText)findViewById(R.id.editNome)).getText().toString();
            String rgm = ((EditText)findViewById(R.id.editRgm)).getText().toString();
            Float np = Float.parseFloat(((EditText)findViewById(R.id.editParcial)).getText().toString());
            Float nt = Float.parseFloat(((EditText)findViewById(R.id.editTrabalhos)).getText().toString());
            Float nr = Float.parseFloat(((EditText)findViewById(R.id.editPri)).getText().toString());



            if(base.update(a,new Aluno (rgm, nome, np, nt, nr))){

                Toast.makeText(getApplicationContext(), "Alteração realizada com sucesso! ", Toast.LENGTH_LONG).show();

            }

        }

    }

}


