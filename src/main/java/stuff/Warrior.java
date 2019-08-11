package stuff;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class Warrior {

    private Player player;

    public Warrior (Player player)
    {


        PlayerInventory inventory = player.getInventory();

        // Clear Inventory
        inventory.clear();

        // Give Warrior Stuff
        inventory.setBoots(new ItemStack(Material.DIAMOND_BOOTS));
        inventory.setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
        inventory.setHelmet(new ItemStack(Material.DIAMOND_HELMET));
        inventory.setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
        inventory.setItemInOffHand(new ItemStack(Material.SHIELD));

        // Giv Weapons
        inventory.setItemInMainHand(new ItemStack(Material.DIAMOND_SWORD));
        ItemStack arrow = new ItemStack(Material.ARROW);
        arrow.setAmount(64);
        ItemStack bow = new ItemStack(Material.BOW);


        ItemStack[] array_items = {
                arrow,
                bow
        };


        inventory.addItem(array_items);

        this.player = player;

    }

    public Player getPlayer() {
        return this.player;
    }


}
