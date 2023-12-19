package me.ryanmood.privatechats.api.spigot.events.impl;

import lombok.Getter;
import me.ryanmood.privatechats.api.spigot.events.RyEvent;
import me.ryanmood.privatechats.spigot.handlers.chats.CustomChat;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

import javax.annotation.Nullable;

public class ChatMessageSentEvent extends RyEvent implements Cancellable {

    @Getter
    private final boolean console;
    @Getter
    @Nullable
    /*
     * Player will be null if console is true.
     */
    private final Player player;
    @Getter
    private final String name;
    @Getter
    private final String message;
    private boolean isCancelled;

    public ChatMessageSentEvent(String chatName, boolean console, String name, @Nullable Player player, String message) {
        super(chatName);
        this.console = console;
        this.name = name;
        this.player = player;
        this.message = message;
        this.isCancelled = false;
    }

    @Override
    public boolean isCancelled() {
        return this.isCancelled;
    }

    @Override
    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }
}
