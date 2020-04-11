package com.example.exercicioaula7bv3;

import com.example.exercicioaula7bv3.model.Aluno;

import java.util.ArrayList;

class ArrayListAlunos {

    private static ArrayList<Aluno> alunos = new ArrayList<>();

    // metodo GET
    public static ArrayList<Aluno> getAlunos() { return alunos;}

    //adiciona -- não sei se essa lógica é suficitente p/ evitar duplicidade de aluno
    static public boolean insert(Aluno a) {

        for (Aluno aluno : alunos) {
            if (!aluno.getRgm().equalsIgnoreCase(a.getRgm())) {
                alunos.add(a);
                return true;
            }
        }

        return false;
    }


    // consulta por rgm
    public Aluno select(String rgm) {
        for (Aluno a : alunos) {

            if (a.getRgm().equalsIgnoreCase(rgm)) {

                a.toString();
            }

        }
        return null;
    }


    //remover
    public boolean delete(Aluno a) {

        for (Aluno aluno : alunos) {
            if (aluno.getRgm().equalsIgnoreCase(a.getRgm())) {
                alunos.remove(a);
                return true;
            }
        }

        return false;
    }

    // alterar

    static public boolean update(Aluno a) {

        for (Aluno aluno : alunos) {
            if (aluno.getRgm().equalsIgnoreCase(a.getRgm())) {

                int index = alunos.indexOf(a);
                if(index > -1){ alunos.add(index,a); }
            }

        }

        return false;
    }


    //listar
    /*static public String listartodos() {
        String resultado = "";

        for (Aluno a : alunos) {
            resultado += a.toString();
        }
        return resultado;
    }*/

}



