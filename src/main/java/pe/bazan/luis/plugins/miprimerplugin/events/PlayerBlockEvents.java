package pe.bazan.luis.plugins.miprimerplugin.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class PlayerBlockEvents implements Listener {
    @EventHandler
    public void onPlayerPlaceBock(BlockPlaceEvent event) {
        Player player = event.getPlayer();

        if (event.getBlock().getType().equals(Material.STONE)) {
            player.sendMessage("Has puesto un bloque de piedra.");
        } else {
            player.sendMessage("Has puesto un bloque.");
        }
    }
}
