package net.gronostay.grobtree.api.processing.apachecxf;

import net.gronostay.grobtree.api.global.Local;
import net.gronostay.grobtree.api.nodes.SimpleLogNode;
import net.gronostay.grobtree.api.nodes.TopLogNode;
import net.gronostay.grobtree.api.processing.LogEntry;
import net.gronostay.grobtree.api.processing.LogTree;

import java.util.Map;

public interface PostCreationListener {
    default void onPayloadNodeCreated(TopLogNode topNode, Map<String, String> valuesMap, SimpleLogNode payloadNode, String payload) {}
    default void onNoNodeCreated(LogEntry logEntry, LogTree logTree, Local local) {}
}
