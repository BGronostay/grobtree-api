package net.gronostay.grobtree.api.context;

/**
 * Get an instance of GlobalContext.
 */
public abstract class GlobalContextProvider {
    static protected GlobalContext globalContext;
    static public GlobalContext getContext() {
        return globalContext;
    }
}