package me.videos;

public class User {

    private String nome;
    private int money;

    public User(String nome, int money) {
        this.nome = nome;
        this.money = money;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
