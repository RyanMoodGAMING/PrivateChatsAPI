package me.ryanmood.privatechats.api.bungee.managers;

import me.ryanmood.privatechats.api.bungee.util.IllegalBungeePluginAccessException;

@SuppressWarnings("unused")
public class EventsAPI {

    /**
     * Get the name of the event.
     *
     * @param eventName The name of the event you wish to use.
     * @return String - The name of the event.
     */
    public String getEvent(String eventName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }

    /**
     * Get the message of the event.
     *
     * @param eventName The name of the event.
     * @return String - The message for the specified event.
     */
    public String getMessage(String eventName) {
        throw new IllegalBungeePluginAccessException("PrivateChatsAPI is not registered!");
    }
}
