package net.gronostay.grobtree.api.storage;

/**
 * A factory to create internal storages of logs
 */
public interface LogStorageFactory {
    LogStorageString createLogStorageString(String description);

    LogStorageBuffer createLogStorageBuffer(String description);

    LogStorageMessages createLogStorageMessages(String description);

    /**
     * Can be called to execute the transformations that were selected in the import dialog
     *
     * @param input The string to be transformed
     * @return the transformed string
     */
    String transform(String input);

    @Deprecated(forRemoval = true)
    String getClipboardContent();
}
