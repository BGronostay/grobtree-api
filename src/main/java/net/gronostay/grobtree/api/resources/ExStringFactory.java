package net.gronostay.grobtree.api.resources;

import net.gronostay.grobtree.api.context.GlobalContextProvider;

/**
 * A factory for creating ExStrings. Use static ExString methods for convenience.
 */
public interface ExStringFactory {

    /**
     * Get a factory instance.
     *
     * @return the factory.
     */
    static ExStringFactory getInstance() {
        return GlobalContextProvider.getContext().getExStringFactory();
    }

    /**
     * Create a new ExString.
     *
     * @return the new ExString.
     */
    ExString create();
}
