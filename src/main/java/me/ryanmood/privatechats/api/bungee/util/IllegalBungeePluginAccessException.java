package me.ryanmood.privatechats.api.bungee.util;

public class IllegalBungeePluginAccessException extends RuntimeException {

    /**
     * Creates a new instance of <code>IllegalPluginAccessException</code>
     * without detail message.
     */
    public IllegalBungeePluginAccessException() {}

    /**
     * Constructs an instance of <code>IllegalPluginAccessException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     * */
    public IllegalBungeePluginAccessException(String msg) {
            super(msg);
        }

}
