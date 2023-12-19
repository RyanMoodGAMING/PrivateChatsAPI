package me.ryanmood.privatechats.api.spigot.managers;

import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

@SuppressWarnings("unused")
public class EventsAPI {

    /**
     * Get the name of the event.
     *
     * @param eventName The name of the event you wish to use.
     * @return String - The name of the event.
     */
    public String getEvent(String eventName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Get the message of the event.
     *
     * @param eventName The name of the event.
     * @return String - The message for the specified event.
     */
    public String getMessage(String eventName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Trigger an event action.
     *
     * @param eventName The name of the event.
     * @param player The player to trigger the event against.
     */
    public void triggered(String eventName, Player player) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Trigger an event action.
     *
     * @param eventName The name of the event.
     * @param player The player to trigger the event against.
     * @param result The result of tht event.
     */
    public void triggered(String eventName, Player player, String result) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Trigger an event action.
     *
     * @param eventName The name of the event.
     * @param player The player to trigger the event against.
     * @param result The result of the event.
     * @param target The target of the event.
     */
    public void triggered(String eventName, Player player, String result, Player target) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

}
