package arena;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class ArenaEnter implements Listener {

    @EventHandler
    public void onPlatePressed(PlayerInteractEvent event) {

        Player player = event.getPlayer();
        Location loc_enterButton = new Location(player.getWorld(), 0, 176, 62);
        Block block = event.getClickedBlock();

        if ((block != null) && (block.getLocation().equals(loc_enterButton))) {
            ArenaInstance arenaInstance = ArenaInstance.getArenaInstance(player);
            arenaInstance.tpPlayer(player);
        }
    }


}
