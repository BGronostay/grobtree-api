package net.gronostay.grobtree.api.storage;

public interface LogStorageFactory {
    LogStorageString createLogStorageString(String description);

    LogStorageBuffer createLogStorageBuffer(String description);

    LogStorageMessages createLogStorageMessages(String description);

    String transform(String input);

    String getClipboardContent();
}
