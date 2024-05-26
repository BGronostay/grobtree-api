package net.gronostay.grobtree.api.nodes.correspondingnode;

/**
 * Implement this interface to highlight corresponding nodes (e.g. response for request). Must be provided when creating a top node.
 * When a top node is selected in the tree, the stored CorrespondingNodeComparer of every top node before and after is checked. Corresponding nodes are shown in another color.
 */
public interface CorrespondingNodeComparer {
    /**
     * @return true if only one before- and after-node should be searched, false means all.
     */
    boolean showOnlyNextNodes();

    /**
     * @return true if corresponding nodes before this node might be available and should be searched. A node containing a response would set this to true if it expects a former corresponding request.
     */
    boolean mightHaveBeforeNode();

    /**
     * @return true if corresponding nodes after this node might be available and should be searched. A node containing a request would set this to true if it expects a later corresponding response.
     */
    boolean mightHaveAfterNode();

    /**
     * This function is called with the CorrespondingNodeComparer objects of other top nodes.
     *
     * @param otherCorrespondingNodeComparer The CorrespondingNodeComparer object of the other node.
     * @return true if these nodes correspond.
     */
    boolean isCorrespondingNode(CorrespondingNodeComparer otherCorrespondingNodeComparer);
}
