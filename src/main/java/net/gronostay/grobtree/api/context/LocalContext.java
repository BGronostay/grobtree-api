package net.gronostay.grobtree.api.context;

import net.gronostay.grobtree.api.global.Local;

public abstract class LocalContext {
    static protected Local local;
    static public Local getContext() {
        return local;
    }
}