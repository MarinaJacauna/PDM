package com.example.exercicioaula7bv3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Listar extends AppCompatActivity {

    private ArrayListAlunos base =  new ArrayListAlunos();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_todos);
        listartodos();
    }

    public void listartodos(){
        String resultado = base.toString();
        ((TextView)findViewById(R.id.list)).setText(resultado);

    }

}
