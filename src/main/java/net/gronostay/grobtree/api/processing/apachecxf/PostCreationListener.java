package net.gronostay.grobtree.api.processing.apachecxf;

import net.gronostay.grobtree.api.nodes.SimpleLogNode;
import net.gronostay.grobtree.api.nodes.TopLogNode;

public interface PostCreationListener {
    void onPayloadNodeCreated(TopLogNode topNode, String serviceName, SimpleLogNode payloadNode, String payload);
}
