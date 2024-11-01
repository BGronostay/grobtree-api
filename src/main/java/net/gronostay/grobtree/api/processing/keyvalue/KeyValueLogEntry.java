package net.gronostay.grobtree.api.processing.keyvalue;

import net.gronostay.grobtree.api.processing.LogEntry;

public interface KeyValueLogEntry extends LogEntry {
    KeyValueLineParams getLineParams();
}
