package net.gronostay.grobtree.api.processing;

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
    default boolean onChecking(LogTree logTree, LineParams lineParams, String text) {
        return false;
    }

    /**
     * Called for every single log output.
     *
     * @param logTree    For adding nodes to the tree.
     * @param lineParams Information about the log lines to be checked.
     * @param text       The current log line(s).
     * @return true if found and no other ProcessingListener in the chain will be called for this text.
     */
    default boolean onChecking(Processing processing, LogTree logTree, LineParams lineParams, String text) {
        return false;
    }
}