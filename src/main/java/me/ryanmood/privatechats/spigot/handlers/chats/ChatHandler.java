package me.ryanmood.privatechats.spigot.handlers.chats;

import org.bukkit.plugin.IllegalPluginAccessException;

import javax.annotation.Nullable;
import java.util.Map;

public class ChatHandler {

    public Map<String, CustomChat> getCustomChatsData() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public @Nullable CustomChat getByName(String name) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public @Nullable CustomChat getByCommand(String command) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public @Nullable CustomChat getByToggleCommand(String command) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }


}
