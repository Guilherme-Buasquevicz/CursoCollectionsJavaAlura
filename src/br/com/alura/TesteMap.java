package br.com.alura;

public class TesteMap {
    public static void main(String[] args) {

        Cursos javaColecoes = new Cursos("Dominando as coleções do Java",
                    "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matriculaAluno(a1);
        javaColecoes.matriculaAluno(a2);
        javaColecoes.matriculaAluno(a3);

        System.out.println("Qual aluno tem a matricula 17645");
        Aluno aluno = javaColecoes.buscaMatriculado(17645);
        System.out.println("Aluno " + aluno);
    }
}

