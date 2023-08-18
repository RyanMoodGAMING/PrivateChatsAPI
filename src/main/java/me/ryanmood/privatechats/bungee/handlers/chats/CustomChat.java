package me.ryanmood.privatechats.bungee.handlers.chats;

import me.ryanmood.privatechats.api.bungee.util.IllegalBungeePluginAccessException;
import net.md_5.bungee.api.connection.ProxiedPlayer;

import javax.annotation.Nullable;
import java.util.List;

public class CustomChat {

    public List<ProxiedPlayer> getToggledPlayers() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public List<ProxiedPlayer> getHiddenPlayers() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getName() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public List<String> getCommands() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getChatPrefix() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getSendPerm() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getReadPerm() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getFormatMessage() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getFormatEvent() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isEventMessage() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isSentMessage() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isConsole() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isToggleEnabled() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isUseCommandsAsToggle() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getToggleMessage() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public List<String> getToggleCommands() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isHideEnabled() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getHideMessage() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public List<String> getHideCommands() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public boolean isChatPrefix() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getCommand() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String[] getAliases() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getToggleCommand() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String[] getToggleAliases() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String getHideCommand() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public String[] getHideAliases() {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void toggleRemove(ProxiedPlayer player) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void toggleAdd(ProxiedPlayer player) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void hiddenRemove(ProxiedPlayer player) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void hiddenAdd(ProxiedPlayer player) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void sendMessage(@Nullable ProxiedPlayer player, String message) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }


    public void sendEventMessage(ProxiedPlayer player, String eventName, String eventMessage) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void sendEventMessage(ProxiedPlayer player, String eventName, String eventMessage, String result) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    public void sendEventMessage(ProxiedPlayer player, String eventName, String eventMessage, String result, ProxiedPlayer target) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

}
