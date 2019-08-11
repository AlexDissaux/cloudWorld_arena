package arena;

import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;
import stuff.Stuff;

public class Arena extends JavaPlugin {

    public Server SERVER = getServer();
    public World CLOUDWORLD = this.SERVER.getWorld("world_cloud");

    @Override
    public void onEnable() {

        // Message to know if plugin works
        getLogger().info("[PLUGIN] Arena plugin launched !");


        // Registering your listener
        this.SERVER.getPluginManager().registerEvents(new Stuff(), this);
        this.SERVER.getPluginManager().registerEvents(new ArenaEnter(), this);


        //spawnMonster =

        // Try to put block in the world
        //ChunkGenerator.ChunkData generator = this.SERVER.createChunkData(this.CLOUDWORLD);
        // generator.setBlock(0,0,175,Material.DIRT);
    }
}
