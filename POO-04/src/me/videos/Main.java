package me.videos;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Doguinho", 5);
        cachorro.acao();

        Gato gato = new Gato("Gatineo", 2);
        gato.acao();


        Animal gato2 = new Gato("Robson Junior", 5);

        gato2.acao();

    }
}
