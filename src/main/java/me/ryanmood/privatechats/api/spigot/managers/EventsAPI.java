package me.ryanmood.privatechats.api.spigot.managers;

import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

@SuppressWarnings("unused")
public class EventsAPI {

    public String getEvent(String eventName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getMessage(String eventName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void triggered(String eventName, Player player) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void triggered(String eventName, Player player, String result) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void triggered(String eventName, Player player, String result, Player target) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

}
