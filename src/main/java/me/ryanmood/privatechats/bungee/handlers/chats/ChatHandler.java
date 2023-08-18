package me.ryanmood.privatechats.bungee.handlers.chats;

import net.md_5.bungee.api.connection.ProxiedPlayer;
import org.bukkit.plugin.IllegalPluginAccessException;

import javax.annotation.Nullable;
import java.util.List;
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

    public List<CustomChat> getByChatToggled(ProxiedPlayer player) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public List<CustomChat> getByChatHidden(ProxiedPlayer player) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

}
