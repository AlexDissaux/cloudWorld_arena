package monsterManager;

import arena.ArenaInstance;
import model.monsterModel;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class MonsterManager implements Listener {

    @EventHandler
    public void onDeathMonster(EntityDeathEvent event) {

        // Check if arena is running
        if (ArenaInstance.getArenaInstance() != null)
        {
            //If monster belong to Arena. current level AND all monster are dead
            if ((ArenaInstance.getArenaInstance()).allMobsLevelDead()) {
                ArenaInstance.getArenaInstance().nextLevel();
            }
        }

    }




}
