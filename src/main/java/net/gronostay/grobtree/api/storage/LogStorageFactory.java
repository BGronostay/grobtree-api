package net.gronostay.grobtree.api.storage;

/**
 * A factory to create internal storages of logs
 */
public interface LogStorageFactory {
    LogStorageString createLogStorageString(String description);
    LogStorageString createLogStorageString(String description, String content);

    LogStorageBuffer createLogStorageBuffer(String description);

    LogStorageMessages createLogStorageMessages(String description);
}
