package me.videos;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void acao() {
        System.out.println("Au au au");
    }


}
