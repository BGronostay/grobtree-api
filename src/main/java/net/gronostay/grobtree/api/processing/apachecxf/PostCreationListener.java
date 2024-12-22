package net.gronostay.grobtree.api.processing.apachecxf;

import net.gronostay.grobtree.api.nodes.SimpleLogNode;
import net.gronostay.grobtree.api.nodes.TopLogNode;

import java.util.Map;

public interface PostCreationListener {
    @Deprecated
    default void onPayloadNodeCreated(TopLogNode topNode, String serviceName, SimpleLogNode payloadNode, String payload) {}

    default void onPayloadNodeCreated(TopLogNode topNode, Map<String, String> valuesMap, SimpleLogNode payloadNode, String payload) {}
}
