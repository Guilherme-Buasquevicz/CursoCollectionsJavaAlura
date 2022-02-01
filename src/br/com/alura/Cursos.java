package br.com.alura;

import java.util.*;

public class Cursos implements Comparable<Cursos>{
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new LinkedHashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new LinkedHashMap<>();

    public Cursos(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona (Aula aula){
        this.aulas.add(aula);
    }

    @Override
    public int compareTo(Cursos outroCurso) {
        return this.nome.compareTo(outroCurso.getNome());
    }

    public int getTempoTotal(){
        int tempoTotal = 0;
        for (Aula aula :aulas) {
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;
    }

    @Override
    public String toString() {
        return "[Curso " + nome + "tempo total " + this.getTempoTotal() + "aulas " + aulas + "]";
    }

    public void matriculaAluno(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatriculado(int numero) {
        if (!matriculaParaAluno.containsKey(numero)) {
            throw new NoSuchElementException();
        }
        return matriculaParaAluno.get(numero);
    }
}

