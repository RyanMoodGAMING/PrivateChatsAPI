package me.ryanmood.privatechats.api.spigot.events;

import lombok.Getter;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class RyEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private final String chatName;

    public RyEvent(String chatName) {
        this(false, chatName);
    }

    public RyEvent(boolean isAsync, String chatName) {
        super(isAsync);
        this.chatName = chatName;
    }

    public String getChatName() {
        return chatName;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }


}
