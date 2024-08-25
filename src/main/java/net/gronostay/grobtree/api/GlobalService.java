package net.gronostay.grobtree.api;

public abstract class GlobalService implements Global {
    static protected GlobalService INSTANCE;
    static public Global getInstance() {
        return INSTANCE;
    }
}