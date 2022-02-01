package br.com.alura;

public class TestaAlunos {
    public static void main(String[] args) {
        Cursos javaColecoes = new Cursos("Dominando as coleções","Paulo silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com arraylist", 21 ));
        javaColecoes.adiciona(new Aula("Criando aula ", 20 ));
        javaColecoes.adiciona(new Aula("Modelando com coleções ", 22));

        Aluno a1 = new Aluno("Rodrigo turini" , 34675);
        Aluno a2 = new Aluno("João paulo", 55464);
        Aluno a3 = new Aluno("Carlos monteiro", 23453);
        Aluno a4 = new Aluno("Guilherme buasquevicz", 71695);

        javaColecoes.matriculaAluno(a1);
        javaColecoes.matriculaAluno(a2);
        javaColecoes.matriculaAluno(a3);
        javaColecoes.matriculaAluno(a4);

        System.out.println("Todos alunos matriculados no cursos " );
        javaColecoes.getAlunos().forEach(a ->{
            System.out.println(a);
        });

        System.out.println("O aluno " + a1 + "Esta matricuçado ? " );
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno turini = new Aluno("Rodrigo turini",34675);
        System.out.println("e esse turini está matriculado ?");
        System.out.println(javaColecoes.estaMatriculado(turini));

        System.out.println("0 a1 e equals ao turini ");
        System.out.println(a1.equals(turini));

    }
}
