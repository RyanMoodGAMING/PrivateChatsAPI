package me.ryanmood.privatechats.api.bungee.events;

import lombok.Getter;
import me.ryanmood.privatechats.bungee.handlers.chats.CustomChat;
import net.md_5.bungee.api.plugin.Event;

public class RyEvent extends Event {

    @Getter
    private final CustomChat chat;

    public RyEvent(CustomChat chat) {
        this.chat = chat;
    }

}
