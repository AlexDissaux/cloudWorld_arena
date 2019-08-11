package arena;


import org.bukkit.Location;
import org.bukkit.entity.Player;

public class ArenaInstance  {

    // static variable single_instance of type Singleton
    private static ArenaInstance arenaInstance = null;


    // private constructor restricted to this class itself
    private ArenaInstance()
    {
        //spawn a monster
    }


    public void tpPlayer (Player player) {
        player.teleport(new Location(player.getWorld(),0, 175, 70));
    }



    // static method to create instance of Singleton class
    public static ArenaInstance getArenaInstance()
    {
        if (arenaInstance == null)
            arenaInstance = new ArenaInstance();

        return arenaInstance;
    }
}