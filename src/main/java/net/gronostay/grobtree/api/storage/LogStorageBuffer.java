package net.gronostay.grobtree.api.storage;

/**
 * A log storage of a string that is intended to be appended.
 */
public interface LogStorageBuffer extends LogStorageString {
    void add(String content);
}