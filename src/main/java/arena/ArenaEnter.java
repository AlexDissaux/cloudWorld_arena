package arena;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class ArenaEnter implements Listener {

    @EventHandler
    public void onPlatePressed(PlayerInteractEvent event) {

        Location loc_enterPlate = new Location(event.getPlayer().getWorld(), 0, 175, 53);
        Block block = event.getClickedBlock();

        if ((block != null) && (block.getLocation().equals(loc_enterPlate))) {
            ArenaInstance.getArenaInstance().tpPlayer(event.getPlayer());
        }
    }


}
