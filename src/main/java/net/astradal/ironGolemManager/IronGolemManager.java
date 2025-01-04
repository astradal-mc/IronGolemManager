package net.astradal.ironGolemManager;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class IronGolemManager extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("IronGolemManager has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("IronGolemManager has been disabled!");

    }
    @EventHandler
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        if (event.getEntityType() == org.bukkit.entity.EntityType.IRON_GOLEM) {
            event.setCancelled(true);
        }
    }
}