package net.gronostay.grobtree.api.processing;

import net.gronostay.grobtree.api.global.Local;

/**
 * Has to be implemented for receiving infos about log outputs.
 */
public interface ProcessingListener extends ProcessingListenerBase {
    /**
     * Called for every single log output.
     *
     * @param logTree    For adding nodes to the tree.
     * @param lineParams Information about the log lines to be checked.
     * @param text       The current log line(s).
     * @return true if found and no other ProcessingListener in the chain will be called for this text.
     */
    @Deprecated(forRemoval = true)
    default boolean onChecking(LogTree logTree, LineParams lineParams, String text) {
        return false;
    }

    /**
     * Called for every single log output.
     *
     * @param logEntry The log entry itself
     * @param logTree  For adding nodes to the tree.
     * @param local    Access to (tab-)local resources etc.
     * @return true if found and no other ProcessingListener in the chain will be called for this text.
     */
    default boolean onChecking(LogEntry logEntry, LogTree logTree, Local local) {
        return false;
    }
}