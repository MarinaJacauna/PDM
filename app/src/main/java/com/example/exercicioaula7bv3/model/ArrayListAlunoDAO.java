package com.example.exercicioaula7bv3.model;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAlunoDAO implements AlunoDAO {

    // Data Access Object, DAO, regras de acesso a banco de dados

    // 1. declarar uma List ou ArrayList (static) para compartilhar os dados dos alunos com
    //    todas as telas
    // 2. implementar todos os métodos da interface AlunoDAO

    public static ArrayList alunos = new ArrayList();


    @Override
    public boolean insert(Aluno aluno) {
      return false;
    }

    @Override
    public boolean delete(Aluno aluno) {
        return false;
    }

    @Override
    public boolean update(Aluno aluno) {
        return false;
    }

    @Override
    public Aluno select(String rgm) {
        return null;
    }

    @Override
    public List<Aluno> selectAll() {
        return null;
    }
}
