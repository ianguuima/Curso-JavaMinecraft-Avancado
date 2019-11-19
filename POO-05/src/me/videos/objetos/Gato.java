package me.videos.objetos;

public class Gato extends Animal {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void food() {
        System.out.println("Chomp chomp");
    }

    @Override
    public void say() {
        System.out.println("Miau miau");
    }
}
