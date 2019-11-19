package me.videos;

public class Gato extends Animal {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void acao() {
        System.out.println("Miaaaaau");
    }
}
