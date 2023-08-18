package me.ryanmood.privatechats.spigot.handlers.chats;

import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.IllegalPluginAccessException;

import javax.annotation.Nullable;
import java.util.List;

public class CustomChat {

    public List<Player> getToggledPlayers() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public List<Player> getHiddenPlayers() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getName() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public List<String> getCommands() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getChatPrefix() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public Permission getSendPerm() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public Permission getReadPerm() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getFormatMessage() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getFormatEvent() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isEventMessage() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isSentMessage() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isConsole() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isToggleEnabled() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isCommandsAsToggle() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getToggleMessage() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public List<String> getToggleCommands() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isHideEnabled() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getHideMessage() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public List<String> getHideCommands() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isChatPrefix() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getCommand() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String[] getAliases() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getToggleCommand() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String[] getToggleAliases() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getHideCommand() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String[] getHideAliases() {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void toggleRemove(Player player) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void toggleAdd(Player player) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void hiddenRemove(Player player) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void hiddenAdd(Player player) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public static CustomChat getByChatPrefix(String chat_prefix) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void sendMessage(@Nullable Player player, String message) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }


    public void sendEventMessage(Player player, String eventName, String eventMessage) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void sendEventMessage(Player player, String eventName, String eventMessage, String result) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void sendEventMessage(Player player, String eventName, String eventMessage, String result, Player target) {
        throw new IllegalPluginAccessException("PrivateChatsAPI is not registered!");
    }

}
