package me.ryanmood.privatechats.api.bungee.managers;

import me.ryanmood.privatechats.api.bungee.util.IllegalBungeePluginAccessException;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@SuppressWarnings("unused")
public class ChatsAPI {

    /**
     * Get the toggled players list for a chat.
     *
     * @param chatName The name of the chat.
     * @return List of ProxiedPlayers who have the chat toggled.
     */
    public List<ProxiedPlayer> getToggledPlayers(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Get the hidden players list for a chat.
     *
     * @param chatName The name of the chat.
     * @return List of ProxiedPlayers who have the chat hidden.
     */
    public List<ProxiedPlayer> getHiddenPlayers(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Get the commands list for a chat.
     *
     * @param chatName The name of the chat.
     * @return List of Strings which are the commands for the chat.
     */
    public List<String> getCommands(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Get the chat prefix for the chat.
     *
     * @param chatName The name of the chat.
     * @return The chat prefix string for the chat.
     */
    public String getChatPrefix(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Get the permission to send a message in a chat.
     *
     * @param chatName The name of the chat.
     * @return The send permission for the chat.
     */
    public String getSendPerm(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Get the permission to read a message in a chat.
     *
     * @param chatName The name of the chat.
     * @return The read permission for the chat.
     */
    public String getReadPerm(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Get the message format for a chat
     *
     * @param chatName The name of the chat.
     * @return The message format for the chat.
     */
    public String getMessageFormat(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Get the event format for a chat
     *
     * @param chatName The name of the chat.
     * @return The event format for the chat.
     */
    public String getEventFormat(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Check if event messages are enabled for a chat.
     *
     * @param chatName The name of the chat.
     * @return boolean
     */
    public boolean isEventMessage(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Check if sent messages are enabled for a chat.
     *
     * @param chatName The name of the chat.
     * @return boolean
     */
    public boolean isSentMessage(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Check if console is enabled for a chat.
     *
     * @param chatName The name of the chat.
     * @return boolean
     */
    public boolean isConsole(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Check if toggled commands are enabled for the chat.
     *
     * @param chatName The name of the chat.
     * @return boolean
     */
    public boolean isToggleEnabled(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Check if the use commands as a toggle is enabled for the chat.
     *
     * @param chatName The name of the chat.
     * @return boolean
     */
    public boolean isUseCommandsAsToggle(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Get the toggle message for a chat.
     *
     * @param chatName The name of the chat.
     * @return String of the toggle message.
     */
    public String getToggleMessage(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Get the commands that are used to toggle the chat.
     *
     * @param chatName The name of the chat.
     * @return List of Strings for the toggle commands.
     */
    public List<String> getToggleCommands(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Check if hide feature is enabled for a chat.
     *
     * @param chatName The name of the chat.
     * @return boolean
     */
    public boolean isHideEnabled(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Get the hide message for a chat.
     *
     * @param chatName The name of the chat.
     * @return String of the hide message.
     */
    public String getHideMessage(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Get the commands that are used to hide the chat.
     *
     * @param chatName The name of the chat.
     * @return List of Strings for the hide commands.
     */
    public List<String> getHideCommands(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Check if the use of a chat prefix is enabled for a chat.
     *
     * @param chatName The name of the chat.
     * @return boolean
     */
    public boolean isChatPrefix(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Get the main command for a chat.
     *
     * @param chatName The name of the chat.
     * @return String which is the command.
     */
    public String getCommand(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Get a list of aliases used for the chat.
     *
     * @param chatName The name of the chat.
     * @return List of command aliases.
     */
    public String[] getAliases(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Get the main toggle command for a chat.
     *
     * @param chatName The name of the chat.
     * @return String which is the toggle command.
     */
    public String getToggleCommand(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Get a list of toggle aliases used for the chat.
     *
     * @param chatName The name of the chat.
     * @return List of command toggle aliases.
     */
    public String[] getToggleAliases(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Get the main hide command for a chat.
     *
     * @param chatName The name of the chat.
     * @return String which is the hide command.
     */
    public String getHideCommand(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }
    /**
     * Get a list of hide aliases used for the chat.
     *
     * @param chatName The name of the chat.
     * @return List of hide command aliases.
     */
    public String[] getHideAliases(String chatName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Remove a player from the chat toggles.
     *
     * @param chatName The name of the chat.
     * @param player The player to remove.
     */
    public void toggleRemove(String chatName, ProxiedPlayer player) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Add a player to the chat toggle.
     *
     * @param chatName The name of the chat.
     * @param player The player to add.
     */
    public void toggleAdd(String chatName, ProxiedPlayer player) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Remove a player from the chat hidden list.
     *
     * @param chatName The name of the chat.
     * @param player The player to remove.
     */
    public void hiddenRemove(String chatName, ProxiedPlayer player) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Add a player to the chat hidden list.
     *
     * @param chatName The name of the chat.
     * @param player The player to add.
     */
    public void hiddenAdd(String chatName, ProxiedPlayer player) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Send a message in a chat from a player.
     *
     * @param chatName The name of the chat.
     * @param player The player to send the message as.
     * @param message The message to be sent.
     */
    public void sendMessage(String chatName, @Nullable ProxiedPlayer player, String message) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Send a message in a chat from a String name.
     *
     * @param chatName The name of the chat.
     * @param name The name of who's sending the message.
     * @param message The message to be sent.
     */
    public void sendMessage(String chatName, String name, String message) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Send an event message in a chat.
     *
     * @param chatName The name of the chat.
     * @param player The player who's activated the event.
     * @param eventName The name of the event.
     * @param eventMessage The message sent by the event.
     */
    public void sendEventMessage(String chatName, ProxiedPlayer player, String eventName, String eventMessage) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Send an event message in a chat.
     *
     * @param chatName The name of the chat.
     * @param player The player who's activated the event.
     * @param eventName The name of the event.
     * @param eventMessage The message sent by the event.
     * @param result The result of the event.
     */
    public void sendEventMessage(String chatName, ProxiedPlayer player, String eventName, String eventMessage, String result) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Send an event message in a chat.
     *
     * @param chatName The name of the chat.
     * @param player The player who's activated the event.
     * @param eventName The name of the event.
     * @param eventMessage The message sent by the event.
     * @param result The result of the event.
     * @param target The target used in the event.
     */
    public void sendEventMessage(String chatName, ProxiedPlayer player, String eventName, String eventMessage, String result, ProxiedPlayer target) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }
}

