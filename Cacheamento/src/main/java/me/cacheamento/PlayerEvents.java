package me.cacheamento;

import me.cacheamento.objects.User;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import static me.cacheamento.Cacheamento.*;

public class PlayerEvents implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        /*
                METODO 1
               Cacheamento instance = Cacheamento.getInstance();
        * */

        getInstance().getUserManager().addUser(new User(e.getPlayer().getName(), "ianguuima@gmail.com"));

    }

}
