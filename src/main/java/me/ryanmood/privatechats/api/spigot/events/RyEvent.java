package me.ryanmood.privatechats.api.spigot.events;

import lombok.Getter;
import me.ryanmood.privatechats.spigot.handlers.chats.CustomChat;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class RyEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private final CustomChat chat;

    public RyEvent(CustomChat chat) {
        this(false, chat);
    }

    public RyEvent(boolean isAsync, CustomChat chat) {
        super(isAsync);
        this.chat = chat;
    }

    public CustomChat getChat() {
        return chat;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }


}
