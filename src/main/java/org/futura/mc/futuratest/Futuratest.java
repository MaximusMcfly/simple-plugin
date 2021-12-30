package org.futura.mc.futuratest;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class Futuratest extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("money").setExecutor(new CommandExecutor() {
            @Override
            public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
                sender.sendMessage("Давай монетки)) я все сделал");
                return true;
            }
        });

        getCommand("easy").setExecutor(new CommandExecutor() {
            @Override
            public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
                sender.sendMessage("Лол это было очень легхко");
                return true;
            }
        });

        getCommand("Kit").setExecutor(new CommandExecutor() {
            @Override
            public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
                sender.sendMessage("Держи два стака алмазов");
                if (sender instanceof Player) {
                    Player player = (Player) sender;
                    ItemStack diamond = new ItemStack(Material.DIAMOND);
                    diamond.setAmount(20);
                    player.getInventory().addItem(diamond);
                }
                return true;
            }
        });

        getCommand("starter").setExecutor(new CommandExecutor() {
            @Override
            public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
                sender.sendMessage("Держи кит старт");
                if (sender instanceof Player) {
                    Player player = (Player) sender;
                    ItemStack sword = new ItemStack(Material.STONE_SWORD);
                    ItemStack pick = new ItemStack(Material.STONE_PICKAXE);
                    ItemStack axe = new ItemStack(Material.STONE_AXE);
                    ItemStack shovel = new ItemStack(Material.STONE_SPADE);
                    ItemStack cap = new ItemStack(Material.LEATHER_HELMET);
                    ItemStack shirt = new ItemStack(Material.LEATHER_CHESTPLATE);
                    ItemStack pants = new ItemStack(Material.LEATHER_LEGGINGS);
                    ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
                    ItemStack planks = new ItemStack(Material.WOOD);
                    ItemStack iron = new ItemStack(Material.IRON_INGOT);
                    ItemStack crystal = new ItemStack(Material.DIAMOND);
                    ItemStack food = new ItemStack(Material.COOKED_BEEF);
                    iron.setAmount(8);
                    crystal.setAmount(2);
                    planks.setAmount(64);
                    food.setAmount(16);
                    player.getInventory().addItem(sword, pick, axe, shovel, cap, shirt, pants, boots, planks, food, iron, crystal);
                }
                return true;
            }
        });
    }

    @Override
    public void onDisable() {
    }
}
