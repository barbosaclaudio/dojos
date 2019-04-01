package br.com.exercicios.model;

public class Cliente {

    private String nome;
    private Long idade;

    public Cliente(String nome, Long idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Long getIdade() {
        return idade;
    }
}
