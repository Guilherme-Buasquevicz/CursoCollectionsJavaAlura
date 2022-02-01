package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Cursos javaColecoes = new Cursos("Dominando as coleções","Paulo silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com arraylist", 21 ));
        javaColecoes.adiciona(new Aula("Criando aula ", 20 ));
        javaColecoes.adiciona(new Aula("Modelando com coleções ", 22 ));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);


    }
}
