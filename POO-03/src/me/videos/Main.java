package me.videos;

public class Main {

    public static void main(String[] args) {

        User user = new User("zAryon", 100);
        User user2 = new User("Carlos", 0);

        user.setMoney(user.getMoney() + 200);
        user2.setMoney(user2.getMoney() + 50);

        System.out.println("Usuário " + user.getNome() + " e balanço: " + user.getMoney());
        System.out.println("Usuário " + user2.getNome() + " e balanço: " + user2.getMoney());


    }
}
