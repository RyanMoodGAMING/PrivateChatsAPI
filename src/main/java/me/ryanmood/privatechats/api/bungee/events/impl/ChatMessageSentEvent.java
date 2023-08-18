package me.ryanmood.privatechats.api.bungee.events.impl;

import lombok.Getter;
import me.ryanmood.privatechats.api.bungee.events.RyEvent;
import me.ryanmood.privatechats.bungee.handlers.chats.CustomChat;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Cancellable;
import org.jetbrains.annotations.Nullable;

public class ChatMessageSentEvent extends RyEvent implements Cancellable {

    @Getter
    private final boolean console;
    @Getter
    @Nullable
    /*
     * Player will be null if console is true.
     */
    private final ProxiedPlayer player;
    @Getter
    private final String message;
    private boolean isCancelled;

    public ChatMessageSentEvent(CustomChat chat, boolean console, @Nullable ProxiedPlayer player, String message) {
        super(chat);
        this.console = console;
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
