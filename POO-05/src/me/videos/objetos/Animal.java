package me.videos.objetos;

public abstract class Animal implements Actions {

    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

}
