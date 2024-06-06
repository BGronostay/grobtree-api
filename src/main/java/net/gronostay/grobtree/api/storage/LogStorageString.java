package net.gronostay.grobtree.api.storage;

public interface LogStorageString extends LogStorage {
    void set(String content);
    void clear();
}
