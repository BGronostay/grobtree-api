package net.gronostay.grobtree.api.storage;

public interface LogStorageBuffer extends LogStorageString {
    void add(String content);
}