package me.videos.objetos;

public class Cachorro {

    private String nome;
    protected int idade;

    public Cachorro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirIdade(){
        System.out.println("A idade do cachorro é: " + idade);
    }
}
