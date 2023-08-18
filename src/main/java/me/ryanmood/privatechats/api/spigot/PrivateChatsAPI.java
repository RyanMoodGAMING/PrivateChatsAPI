package me.ryanmood.privatechats.api;

import lombok.Getter;
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

    public Map<String, CustomChat>

}
