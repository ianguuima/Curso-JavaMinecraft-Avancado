package me.cacheamento.managers;

import me.cacheamento.objects.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager {

    private List<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    public void addUser(User user){
        if (getUser(user.getName()) == null) {
            users.add(user);
            System.out.println("Usuario adicionado!");
        }
    }

    public User getUser(String username){
        return users.stream().filter(u -> u.getName().equalsIgnoreCase(username)).findFirst().orElse(null);
    }

    public void removeUser(String username){
        final User user = getUser(username);
        if (user != null) {
            users.remove(user);
        }
    }


}
