package net.gronostay.grobtree.api.context;

/**
 * Get an instance of ContextContext.
 */
public abstract class LocalContextProvider {
    static protected LocalContext localContext;
    static public LocalContext getContext() {
        return localContext;
    }
}