package me.ryanmood.privatechats.spigot.handlers.events;

import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

public class CustomEvent {

    public String getEvent() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getMessage() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void triggered(Player player) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void triggered(Player player, String result) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void triggered(Player player, String result, Player target) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

}
