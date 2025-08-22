package net.gronostay.grobtree.api.processing;

/**
 * Has to be implemented for receiving infos about log outputs.
 */
public interface ProcessingListener {
    /**
     * Called before import or when starting evaluating.
     */
    default void onPreChecking() { }

    /**
     * Called for every single log output.
     *
     * @param logEntry The log entry itself
     * @param logTree  For adding nodes to the tree.
     * @return true if found and no other ProcessingListener in the chain will be called for this text.
     */
    default boolean onChecking(LogEntry logEntry, LogTree logTree) {
        return false;
    }
}