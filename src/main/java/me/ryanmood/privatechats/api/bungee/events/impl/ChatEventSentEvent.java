package me.ryanmood.privatechats.api.bungee.events.impl;

import lombok.Getter;
import me.ryanmood.privatechats.api.bungee.events.RyEvent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Cancellable;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("unused")
public class ChatEventSentEvent extends RyEvent implements Cancellable {

    @Getter
    private final ProxiedPlayer player;
    @Getter
    private final String eventName;
    @Getter
    private final String eventMessage;
    @Getter
    @Nullable
    /*
     * Might be null if the event doesn't give a result.
     */
    private final String result;
    @Getter
    @Nullable
    /*
     * Might be null if the event doesn't have a target.
     */
    private final ProxiedPlayer target;
    private boolean isCancelled;

    public ChatEventSentEvent(String chatName, ProxiedPlayer player, String eventName, String eventMessage, @Nullable String result,
                              @Nullable ProxiedPlayer target) {
        super(chatName);
        this.player = player;
        this.eventName = eventName;
        this.eventMessage = eventMessage;
        this.result = result;
        this.target = target;
        this.isCancelled = false;
    }

    public ChatEventSentEvent(String chatName, ProxiedPlayer player, String eventName, String eventMessage) {
        this(chatName, player, eventName, eventMessage, null, null);
    }

    public ChatEventSentEvent(String chatName, ProxiedPlayer player, String eventName, String eventMessage, String result) {
        this(chatName, player, eventName, eventMessage, result, null);
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
