package arena;


import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;

public class ArenaInstance  {

    

    // static variable single_instance of type Singleton
    private static ArenaInstance arenaInstance = null;


    // private constructor restricted to this class itself
    private ArenaInstance(Player player)
    {
        World world = player.getWorld();

        world.setTime(13000);

        //spawn a monster
        Location loc_spawnMonster = new Location(world, 0, 175, 100);


        world.spawnEntity(loc_spawnMonster, EntityType.ZOMBIE);
        world.spawnEntity(loc_spawnMonster, EntityType.ZOMBIE);
        world.spawnEntity(loc_spawnMonster, EntityType.ZOMBIE);
        world.spawnEntity(loc_spawnMonster, EntityType.ZOMBIE);
        world.spawnEntity(loc_spawnMonster, EntityType.ZOMBIE);
        world.spawnEntity(loc_spawnMonster, EntityType.ZOMBIE);
        world.spawnEntity(loc_spawnMonster, EntityType.ZOMBIE);
        world.spawnEntity(loc_spawnMonster, EntityType.ZOMBIE);
    }


    public void tpPlayer (Player player) {
        player.teleport(new Location(player.getWorld(),0, 175, 70));
    }



    // static method to create instance of Singleton class
    public static ArenaInstance getArenaInstance(Player player)
    {
        if (arenaInstance == null)
            arenaInstance = new ArenaInstance(player);

        return arenaInstance;
    }
}