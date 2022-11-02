package br.com.ebac.colecoes;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private char sexo;

    public Pessoa(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public int compareTo(Pessoa o) {
        return nome.compareTo(o.getNome());
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
