package me.ryanmood.privatechats.api.spigot;

import lombok.AccessLevel;
import lombok.Getter;
import me.ryanmood.privatechats.api.spigot.managers.ChatsAPI;
import me.ryanmood.privatechats.api.spigot.managers.EventsAPI;
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

    /**
     * @return If PrivateChatsAPI is registered or not.
     */
    public static boolean isRegistered() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isToggled(UUID uuid, String chat) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isHidden(UUID uuid, String chat) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public ChatsAPI getChatsAPI() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public EventsAPI getEventsAPI() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

}
