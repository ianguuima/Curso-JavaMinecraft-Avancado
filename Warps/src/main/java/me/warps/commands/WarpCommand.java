package me.warps.commands;

import me.warps.Warps;
import me.warps.managers.WarpManager;
import me.warps.objects.Warp;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WarpCommand implements CommandExecutor {

    private static final Warps INSTANCE = Warps.getInstance();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("warp")) {


            WarpManager warpManager = INSTANCE.getWarpManager();

            // warp list
            // warp ir <nome>
            // warp remove
            // warp set <nome>

            if (!(sender instanceof Player)) {
                sender.sendMessage("Somente jogadores podem usar este comando!");
                return false;
            }

            Player p = (Player) sender;

            if (args.length == 0) {
                p.sendMessage(" ");
                p.sendMessage("§7/warp list");
                p.sendMessage("§7/warp ir <nome>");
                p.sendMessage("§7/warp remove <nome>");
                p.sendMessage("§7/warp set <nome>");
                p.sendMessage(" ");
            }

            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("list")) {
                    p.sendMessage(warpManager.list());
                }
            }

            if (args.length == 2) {

                String warpName = args[1];

                if (args[0].equalsIgnoreCase("ir")) {

                    final Warp warp = warpManager.get(warpName);
                    warpManager.go(p, warp);
                }


                if (args[0].equalsIgnoreCase("remove")) {

                    if (warpManager.delete(warpName)) {
                        p.sendMessage("A warp " + warpName + " foi deletada com sucesso!");
                        return true;
                    }

                    p.sendMessage("A warp nao existe ou não foi deletada com sucesso!");

                }


                if (args[0].equalsIgnoreCase("set")) {
                    warpManager.insert(new Warp(warpName, p.getLocation()));
                    p.sendMessage("A warp " + warpName + " foi setada com sucesso!");
                }

            }


        }

        return false;
    }


}
