package me.ryanmood.privatechats.api.handlers.chats;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomChat {

    private static Map<String, CustomChat> chatsData = PrivateChats.getInstance().getChatHandler().getCustomChatsData();

    @Getter
    private List<Player> toggledPlayers = new ArrayList<>();
    @Getter
    private List<Player> hiddenPlayers = new ArrayList<>();

    @Getter
    @NotNull
    private String name;
    @Getter
    @Nullable
    private List<String> commands;
    @Getter
    @Nullable
    private String chatPrefix;
    @Getter
    @NotNull
    private Permission sendPerm;
    @Getter
    @NotNull
    private Permission readPerm;
    @Getter
    @Nullable
    private String formatMessage;
    @Getter
    @Nullable
    private String formatEvent;
    @Getter
    private boolean eventMessage;
    @Getter
    private boolean sentMessage;
    @Getter
    private boolean console;
    @Getter
    private boolean toggleEnabled;
    @Getter
    private boolean useCommandsAsToggle;
    @Getter
    @Nullable
    private String toggleMessage;
    @Getter
    @Nullable
    private List<String> toggleCommands;
    @Getter
    private boolean hideEnabled;
    @Getter
    @Nullable
    private String hideMessage;
    @Getter
    @Nullable
    private List<String> hideCommands;

    public CustomChat(@NotNull String name, @Nullable List<String> commands, @Nullable String chat_prefix, @NotNull Permission send_perm,
                      @NotNull Permission read_perm, @Nullable String format_message, @Nullable String format_event, boolean event_message, boolean sent_message,
                      boolean console, boolean toggle_enabled, boolean useCommandsAsToggle, @Nullable String toggle_message, @Nullable List<String> toggle_commands,
                      boolean hideEnabled, @Nullable String hideMessage, @Nullable List<String> hideCommands) {
        this.name = name;
        this.commands = commands;
        this.chatPrefix = chat_prefix;
        this.sendPerm = send_perm;
        this.readPerm = read_perm;
        this.formatMessage = format_message;
        this.formatEvent = format_event;
        this.eventMessage = event_message;
        this.sentMessage = sent_message;
        this.console = console;
        this.toggleEnabled = toggle_enabled;
        this.useCommandsAsToggle = useCommandsAsToggle;
        this.toggleMessage = toggle_message;
        this.toggleCommands = toggle_commands;
        this.hideEnabled = hideEnabled;
        this.hideMessage = hideMessage;
        this.hideCommands = hideCommands;

        this.addCommand();
    }

    public boolean isChatPrefix() {
        if (this.chatPrefix == null || this.chatPrefix.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public String getCommand() {
        if (this.commands == null) return null;
        return this.commands.get(0);
    }

    public String[] getAliases() {
        List<String> aliases = new ArrayList<>();
        if (this.commands == null) return aliases.stream().toArray(String[]::new);
        if (this.commands.size() > 1) {
            aliases.addAll(this.commands.subList(1, this.commands.size()));
        }
        return aliases.stream().toArray(String[]::new);
    }

    public String getToggleCommand() {
        if (this.toggleEnabled && this.toggleCommands != null) {
            return this.toggleCommands.get(0);
        } else {
            return null;
        }
    }

    public String[] getToggleAliases() {
        List<String> aliases = new ArrayList<>();
        if (this.toggleEnabled && this.toggleCommands != null) {
            if (this.toggleCommands.size() > 1) {
                aliases.addAll(this.toggleCommands.subList(1, this.toggleCommands.size()));
            }
        }
        return aliases.stream().toArray(String[]::new);
    }

    public String getHideCommand() {
        if (this.isHideEnabled() && this.hideCommands != null) {
            return this.hideCommands.get(0);
        } else {
            return null;
        }
    }

    public String[] getHideAliases() {
        List<String> aliases = new ArrayList<>();
        if (this.isHideEnabled() && this.hideCommands != null) {
            aliases.addAll(this.hideCommands.subList(1, this.hideCommands.size()));
        }
        return aliases.stream().toArray(String[]::new);
    }

    public void toggleRemove(Player player) {
        this.toggledPlayers.remove(player);
    }

    public void toggleAdd(Player player) {
        this.toggledPlayers.add(player);
    }

    public void hiddenRemove(Player player) {
        this.hiddenPlayers.remove(player);
    }

    public void hiddenAdd(Player player) {
        this.hiddenPlayers.add(player);
    }

    public static CustomChat getByChatPrefix(String chat_prefix) {
        for (CustomChat chat : chatsData.values()) {
            if (!chat.isChatPrefix()) continue;
            if (chat_prefix.equalsIgnoreCase(chat.getChatPrefix())) {
                return chat;
            }
        }
        return null;
    }

    public void sendMessage(@Nullable Player player, String message) {
        boolean console = false;
        if (player == null) {
            console = true;
        }

        ChatMessageSentEvent event = new ChatMessageSentEvent(this, console, player, message);
        Bukkit.getScheduler().runTask(PrivateChats.getInstance(), () -> Bukkit.getPluginManager().callEvent(event));
        if (event.isCancelled()) return;

        if (this.getFormatMessage() == null) {
            if (player != null) {
                RyMessageUtils.sendPlayer(player, RyMessageUtils.getErrorPrefix() +
                        "I couldn't send that message as format_message is invalid for this chat.");
            } else {
                RyMessageUtils.sendConsole(false, RyMessageUtils.getErrorPrefix() +
                        "I couldn't send that message as format_message is invalid for this chat.");
            }
            return;
        }

        for (Player online : Bukkit.getOnlinePlayers()) {
            if (!online.hasPermission(this.getReadPerm())) continue;
            if (this.hiddenPlayers.contains(online)) continue;

            RyMessageUtils.sendPlayer(online, this.getFormatMessage()
                    .replace("%player%", console ? Config.getCONSOLE_NAME() : player.getName())
                    .replace("%message%", message));
        }

        if (this.console) {
            RyMessageUtils.sendConsole(false, this.getFormatMessage()
                    .replace("%player%", console ? Config.getCONSOLE_NAME() : player.getName())
                    .replace("%message%", message));
        }
    }


    public void sendEventMessage(Player player, String eventName, String eventMessage) {
        if (this.getFormatEvent() == null) {
            RyMessageUtils.sendConsole(true, "I couldn't send an event notification as format_event is null for " + this.getName() + " chat.");
            return;
        }

        ChatEventSentEvent event = new ChatEventSentEvent(this, player, eventName, eventMessage);
        Bukkit.getScheduler().runTask(PrivateChats.getInstance(), () -> Bukkit.getPluginManager().callEvent(event));
        if (event.isCancelled()) return;

        for (Player online : Bukkit.getOnlinePlayers()) {
            if (!online.hasPermission(this.getReadPerm())) continue;
            if (this.hiddenPlayers.contains(online)) continue;

            RyMessageUtils.sendPlayer(online, this.getFormatEvent()
                    .replace("%player%", player.getName())
                    .replace("%message%", eventMessage));

        }

        if (this.console) {
            RyMessageUtils.sendConsole(false, this.getFormatEvent()
                    .replace("%message%", eventMessage)
                    .replace("%player%", player.getName()));
        }
    }

    public void sendEventMessage(Player player, String eventName, String eventMessage, String result) {
        if (this.getFormatEvent() == null) {
            RyMessageUtils.sendConsole(false, RyMessageUtils.getErrorPrefix() +
                    "I couldn't send an event notification as format_event is null for " + this.getName() + " chat.");
            return;
        }

        ChatEventSentEvent event = new ChatEventSentEvent(this, player, eventName, eventMessage, result);
        Bukkit.getScheduler().runTask(PrivateChats.getInstance(), () -> Bukkit.getPluginManager().callEvent(event));
        if (event.isCancelled()) return;

        for (Player online : Bukkit.getOnlinePlayers()) {
            if (!online.hasPermission(this.getReadPerm())) continue;
            if (this.hiddenPlayers.contains(online)) continue;

            RyMessageUtils.sendPlayer(online, this.getFormatEvent()
                    .replace("%message%", eventMessage)
                    .replace("%player%", player.getName())
                    .replace("%result%", result));

        }
        if (this.console) {
            RyMessageUtils.sendConsole(false, this.getFormatEvent()
                    .replace("%message%", eventMessage)
                    .replace("%player%", player.getName())
                    .replace("%result%", result));
        }
    }

    public void sendEventMessage(Player player, String eventName, String eventMessage, String result, Player target) {
        if (this.getFormatEvent() == null) {
            RyMessageUtils.sendConsole(false, RyMessageUtils.getErrorPrefix() +
                    "I couldn't send an event notification as format_event is null for " + this.getName() + " chat.");
            return;
        }

        ChatEventSentEvent event = new ChatEventSentEvent(this, player, eventName, eventMessage, result, target);
        Bukkit.getScheduler().runTask(PrivateChats.getInstance(), () -> Bukkit.getPluginManager().callEvent(event));
        if (event.isCancelled()) return;

        for (Player online : Bukkit.getOnlinePlayers()) {
            if (!online.hasPermission(this.getReadPerm())) continue;
            if (this.hiddenPlayers.contains(online)) continue;

            RyMessageUtils.sendPlayer(online, this.getFormatEvent()
                    .replace("%message%", eventMessage)
                    .replace("%player%", player.getName())
                    .replace("%result%", result)
                    .replace("%target%", target.getName()));

        }
        if (this.console) {
            RyMessageUtils.sendConsole(false, this.getFormatEvent()
                    .replace("%message%", eventMessage)
                    .replace("%player%", player.getName())
                    .replace("%result%", result)
                    .replace("%target%", target.getName()));
        }
    }




}
