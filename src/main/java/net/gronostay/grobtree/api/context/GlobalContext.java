package net.gronostay.grobtree.api.context;

import net.gronostay.grobtree.api.Global;

public abstract class GlobalContext {
    static protected Global global;
    static public Global getContext() {
        return global;
    }
}