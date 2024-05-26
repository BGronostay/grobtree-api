package net.gronostay.grobtree.api.nodes.correspondingnode;

/**
 * Create instances of CorrespondingNodeComparer using Objects and comparing using .equals().
 * See also {@link CorrespondingNodeComparer}.
 */
public class EqualityCorrespondingNodeComparer implements CorrespondingNodeComparer {
    private final String uniqueId;
    private final boolean showOnlyNextNodes;
    private final boolean mightHaveBeforeNode;
    private final boolean mightHaveAfterNode;
    private final Object item;

    /**
     * Create an instance that stores objects and compares them using equals().
     *
     * @param uniqueId            A unique String to distinguish the class of objects to be compared. By using this, some kind of top nodes could compare employee names, others may compare customer names.
     * @param item                A unique Object that identifies a relationship between another top node using equals(), e.g. a correlation id.
     * @param showOnlyNextNodes   true if only at most one node in both directions should be searched.
     * @param mightHaveBeforeNode true if corresponding nodes before this node might be available and should be searched. A node containing a response would set this to true if it expects a former corresponding request.
     * @param mightHaveAfterNode  true if corresponding nodes after this node might be available and should be searched. A node containing a request would set this to true if it expects a later corresponding response.
     * @return The new instance.
     */
    public static CorrespondingNodeComparer create(String uniqueId, Object item, boolean showOnlyNextNodes, boolean mightHaveBeforeNode, boolean mightHaveAfterNode) {
        if (!(mightHaveBeforeNode || mightHaveAfterNode)) return null;
        return new EqualityCorrespondingNodeComparer(uniqueId, item, showOnlyNextNodes, mightHaveBeforeNode, mightHaveAfterNode);
    }

    /**
     * Create an instance that stores objects and compares them using equals().
     * Searches for all corresponding nodes in both directions.
     *
     * @param uniqueId A unique String to distinguish the class of objects to be compared. By using this, some kind of top nodes could compare employee names, others may compare customer names.
     * @param item     A unique Object that identifies a relationship between another top node using equals(), e.g. a correlation id.
     * @return The new instance.
     */
    public static CorrespondingNodeComparer createShowAll(String uniqueId, Object item) {
        return new EqualityCorrespondingNodeComparer(uniqueId, item, false, true, true);
    }

    public EqualityCorrespondingNodeComparer(String uniqueId, Object item, boolean showOnlyNextNodes, boolean mightHaveBeforeNode, boolean mightHaveAfterNode) {
        this.uniqueId = uniqueId;
        this.showOnlyNextNodes = showOnlyNextNodes;
        this.mightHaveBeforeNode = mightHaveBeforeNode;
        this.mightHaveAfterNode = mightHaveAfterNode;
        this.item = item;
    }

    @Override
    public boolean showOnlyNextNodes() {
        return showOnlyNextNodes;
    }

    @Override
    public boolean mightHaveBeforeNode() {
        return mightHaveBeforeNode;
    }

    @Override
    public boolean mightHaveAfterNode() {
        return mightHaveAfterNode;
    }

    @Override
    public boolean isCorrespondingNode(CorrespondingNodeComparer otherCorrespondingNodeComparer) {
        if (!(otherCorrespondingNodeComparer instanceof EqualityCorrespondingNodeComparer castOtherCorrespondingNodeComparer)) {
            return false;
        }

        if (!this.uniqueId.equals(castOtherCorrespondingNodeComparer.uniqueId)) {
            return false;
        }

        return this.item.equals(castOtherCorrespondingNodeComparer.item);
    }
}
