package me.ryanmood.privatechats.bungee.handlers.events;

import me.ryanmood.privatechats.api.bungee.util.IllegalBungeePluginAccessException;

public class CustomEvent {

    public String getEvent() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getMessage() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

}
