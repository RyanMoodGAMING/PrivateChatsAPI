package me.ryanmood.privatechats.api.bungee.events;

import lombok.Getter;
import net.md_5.bungee.api.plugin.Event;

@SuppressWarnings("unused")
public class RyEvent extends Event {

    @Getter
    private final String chatName;

    public RyEvent(String chatName) {
        this.chatName = chatName;
    }

}
