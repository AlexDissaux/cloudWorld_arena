package model;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;


public class monsterModel {

    private static EntityType[][] levels = {
            {
                EntityType.ZOMBIE,
                EntityType.ZOMBIE,
                EntityType.ZOMBIE,
                EntityType.ZOMBIE
            },
            {
                EntityType.ZOMBIE,
                EntityType.ZOMBIE,
                EntityType.ZOMBIE,
                EntityType.ZOMBIE,
                EntityType.ZOMBIE,
                EntityType.ZOMBIE,
                EntityType.ZOMBIE,
                EntityType.ZOMBIE,
                EntityType.ZOMBIE,
                EntityType.ZOMBIE,
                EntityType.ZOMBIE
            },
    };

    public static EntityType[][] getLevels() {
        return levels;
    }

    public static Location getSpawnMonster(World world) { return new Location(world, 0, 175, 100);
    }

}
