package com.example.exercicioaula7bv3.model;

import java.util.List;

public interface AlunoDAO {
    public boolean insert(Aluno aluno);
    public boolean delete(Aluno aluno);
    public boolean update(Aluno aluno);
    public Aluno select(String rgm);
    public List<Aluno> selectAll();
    public String toString();
}
