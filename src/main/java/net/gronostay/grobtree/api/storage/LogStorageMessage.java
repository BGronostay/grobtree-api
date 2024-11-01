package net.gronostay.grobtree.api.storage;

import net.gronostay.grobtree.api.processing.keyvalue.KeyValueLineParams;

/**
 * A log storage consisting of separate log messages that are already split in meta-infos and text.
 */
public interface LogStorageMessage extends LogStorage {
    String getText();

    void setText(String text);

    KeyValueLineParams getLineParams();
}
