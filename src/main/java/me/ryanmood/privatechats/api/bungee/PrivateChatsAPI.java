package me.ryanmood.privatechats.api.bungee;

import lombok.Getter;
import me.ryanmood.privatechats.api.bungee.util.IllegalBungeePluginAccessException;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

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

    /* public ChatHandler getChatHandler() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public EventHandler getEventHandler() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    } */

}
