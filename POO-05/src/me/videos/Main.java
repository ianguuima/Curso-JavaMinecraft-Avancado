package me.videos;

import me.videos.objetos.Animal;
import me.videos.objetos.Cachorro;
import me.videos.objetos.Gato;

public class Main {

    public static void main(String[] args) {


        Animal cachorro = new Cachorro("DoguinhoSaliente", 2);
        cachorro.say();

        Animal gato = new Gato("Whiskas", 1);
        gato.say();

    }

}
