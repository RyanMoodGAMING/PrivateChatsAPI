package me.ryanmood.privatechats.bungee.handlers.events;

import org.bukkit.plugin.IllegalPluginAccessException;

import javax.annotation.Nullable;
import java.util.Map;

public class EventHandler {

    public Map<String, CustomEvent> getCustomEventsData() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public @Nullable CustomEvent getByEvent(String event) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

}
