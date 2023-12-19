package me.ryanmood.privatechats.api.bungee;

import lombok.Getter;
import me.ryanmood.privatechats.api.bungee.manager.ChatsAPI;
import me.ryanmood.privatechats.api.bungee.manager.EventsAPI;
import me.ryanmood.privatechats.api.bungee.util.IllegalBungeePluginAccessException;

import java.util.UUID;

@SuppressWarnings("unused")
public final class PrivateChatsAPI {

    /**
     * PrivateChat API allows you to hook into PrivateChats.
     * If you have any questions, please feel free to reach out.
     * https://discord.ryanmoood.me
     */

    @Getter
    private static PrivateChatsAPI instance;

    public boolean isRegistered() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isToggled(UUID uuid, String chat) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isHidden(UUID uuid, String chat) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public ChatsAPI getChatsAPI() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public EventsAPI getEventsAPI() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

}
