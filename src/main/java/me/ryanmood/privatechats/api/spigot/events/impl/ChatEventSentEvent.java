package me.ryanmood.privatechats.api.spigot.events.impl;

import lombok.Getter;
import me.ryanmood.privatechats.api.spigot.events.RyEvent;
import me.ryanmood.privatechats.spigot.handlers.chats.CustomChat;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

import javax.annotation.Nullable;

public class ChatEventSentEvent extends RyEvent implements Cancellable {

    @Getter
    private final Player player;
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
    private final Player target;
    private boolean isCancelled;

    public ChatEventSentEvent(CustomChat chat, Player player, String eventName, String eventMessage, @Nullable String result,
                              @Nullable Player target) {
        super(chat);
        this.player = player;
        this.eventName = eventName;
        this.eventMessage = eventMessage;
        this.result = result;
        this.target = target;
        this.isCancelled = false;
    }

    public ChatEventSentEvent(CustomChat chat, Player player, String eventName, String eventMessage) {
        this(chat, player, eventName, eventMessage, null, null);
    }

    public ChatEventSentEvent(CustomChat chat, Player player, String eventName, String eventMessage, String result) {
        this(chat, player, eventName, eventMessage, result, null);
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
