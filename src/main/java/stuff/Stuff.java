package stuff;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class Stuff implements Listener {

   /* org.bukkit.event.EventHandler.
        //    PlayerInteractEvent​(Player who, Action action, ItemStack item, Block clickedBlock, BlockFace clickedFace)
    */

    @EventHandler
    public void onClickButton(PlayerInteractEvent event) {

        Player player = event.getPlayer();

        Location loc_button_warriorStuff = new Location(player.getWorld(),5, 176, 54);

        Block block = event.getClickedBlock();

        if ((block != null ) && (block.getLocation().equals(loc_button_warriorStuff)))
        {
            new Warrior(event.getPlayer());
        }
    }
}
