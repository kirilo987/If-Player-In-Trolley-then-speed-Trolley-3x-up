package org.kxysl1k.trolleyspeedx3;

import org.bukkit.entity.Minecart;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

public class Trolleyspeedx3 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onMinecartMove(VehicleMoveEvent event) {
        if (event.getVehicle() instanceof Minecart minecart) {
            // Перевіряємо, чи є всередині гравець
            boolean hasPlayer = minecart.getPassengers().stream().anyMatch(e -> e instanceof Player);

            if (hasPlayer) {
                Vector velocity = minecart.getVelocity();
                minecart.setVelocity(velocity.multiply(3)); // Збільшуємо швидкість в 3 рази
            }
        }
    }
}

