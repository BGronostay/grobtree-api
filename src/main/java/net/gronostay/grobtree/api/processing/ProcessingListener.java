package net.gronostay.grobtree.api.processing;

import net.gronostay.grobtree.api.global.Local;

/**
 * Has to be implemented for receiving infos about log outputs.
 */
public interface ProcessingListener extends ProcessingListenerBase {
    /**
     * Called before import or when starting evaluating.
     *
     * @param local    Access to (tab-)local resources etc.
     */
    default void onPreChecking(Local local) { }

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