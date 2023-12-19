package me.ryanmood.privatechats.api.bungee.events.impl;

import lombok.Getter;
import me.ryanmood.privatechats.api.bungee.events.RyEvent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Cancellable;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("unused")
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
    private final String name;
    @Getter
    private final String message;
    private boolean isCancelled;

    public ChatMessageSentEvent(String chatName, boolean console, String name, @Nullable ProxiedPlayer player, String message) {
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
