package arena;


import model.monsterModel;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;

public class ArenaInstance  {


    // static variable single_instance of type Singleton
    private static ArenaInstance arenaInstance = null;
    private final World world;
    private int currentLevel = 0;

    private ArenaInstance(Player player)
    {

        World world = player.getWorld();
        this.world = world;
        world.setTime(13000);

        this.levelSpawn(this.currentLevel);
    }

    private void levelSpawn(int i) {
        for (EntityType mob : monsterModel.getLevels()[i])
        {
            this.world.spawnEntity(monsterModel.getSpawnMonster(this.world), mob);
        }
    }

    public void nextLevel () {
        this.currentLevel ++;
        this.levelSpawn(this.currentLevel);

    }

    public boolean allMobsLevelDead() {
        boolean res = true;
        for (EntityType mob : monsterModel.getLevels()[this.currentLevel])
        {
            res = (res && ! mob.isAlive());
        }
        return res;
    }




    void tpPlayer(Player player) {
        player.teleport(new Location(player.getWorld(),0, 175, 70));
    }



    // static method to create instance of Singleton class
    public static ArenaInstance getArenaInstance(Player player)
    {
        if (arenaInstance == null)
            arenaInstance = new ArenaInstance(player);

        return arenaInstance;
    }
    // static method to create instance of Singleton class
    public static ArenaInstance getArenaInstance()
    {
        if (arenaInstance == null)
            return null;
        return arenaInstance;
    }
}