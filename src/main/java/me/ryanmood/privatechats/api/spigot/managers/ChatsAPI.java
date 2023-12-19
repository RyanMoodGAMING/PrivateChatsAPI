package me.ryanmood.privatechats.api.spigot.managers;

import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.IllegalPluginAccessException;

import javax.annotation.Nullable;
import java.util.List;

public class ChatsAPI {

    public List<Player> getToggledPlayers(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public List<Player> getHiddenPlayers(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getName(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public List<String> getCommands(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getChatPrefix(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public Permission getSendPerm(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public Permission getReadPerm(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getFormatMessage(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getFormatEvent(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isEventMessage(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isSentMessage(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isConsole(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isToggleEnabled(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isUseCommandsAsToggle(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getToggleMessage(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public List<String> getToggleCommands(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isHideEnabled(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getHideMessage(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public List<String> getHideCommands(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isChatPrefix(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getCommand(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String[] getAliases(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getToggleCommand(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String[] getToggleAliases(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getHideCommand(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String[] getHideAliases(String chatName) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void toggleRemove(String chatName, Player player) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void toggleAdd(String chatName, Player player) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void hiddenRemove(String chatName, Player player) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void hiddenAdd(String chatName, Player player) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void sendMessage(String chatName, @Nullable Player player, String message) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void sendMessage(String chatName, String name, String message) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void sendEventMessage(String chatName, Player player, String eventName, String eventMessage) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void sendEventMessage(String chatName, Player player, String eventName, String eventMessage, String result) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void sendEventMessage(String chatName, Player player, String eventName, String eventMessage, String result, Player target) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

}
