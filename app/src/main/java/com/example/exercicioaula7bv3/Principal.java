package com.example.exercicioaula7bv3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.exercicioaula7bv3.model.ArrayListAlunoDAO;

public class Principal extends AppCompatActivity implements View.OnClickListener {

    private Button btn_cad, btn_con, btn_alt, btn_apa, btn_edi,btn_sob, btn_lis;
    private ArrayListAlunoDAO base = new ArrayListAlunoDAO();
    // ou
    // private ArrayListAlunos base = new ArrayListAlunos();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_cad = (Button)findViewById(R.id.cad);
        btn_con = (Button)findViewById(R.id.con);
        btn_alt = (Button)findViewById(R.id.alt);
        btn_apa = (Button)findViewById(R.id.apa);
        btn_lis = (Button)findViewById(R.id.list);
        btn_sob = (Button)findViewById(R.id.sobre);

        //...

        btn_cad.setOnClickListener(this);
        btn_con.setOnClickListener(this);
        btn_alt.setOnClickListener(this);
        btn_apa.setOnClickListener(this);
        btn_lis.setOnClickListener(this);
        btn_sob.setOnClickListener(this);
        //...

    }

    @Override
    public void onClick(View v) {
        Class classe = null;
        switch (v.getId()){
            case R.id.cad: classe = Cadastrar.class; break;
            case R.id.con: classe = Consultar.class; break;
            case R.id.alt: classe = Alterar.class;   break;
            case R.id.apa: classe = Apagar.class;   break;
            case R.id.list: classe = Listar.class; break;
            case R.id.sobre: classe = Sobre.class; break;

            //...
        }
        if (classe != null){
            Intent myIntent = new Intent(getApplicationContext(),classe);
            startActivity(myIntent);
        }
    }
}
