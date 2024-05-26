package net.gronostay.grobtree.api.nodes;

import net.gronostay.grobtree.api.nodes.correspondingnode.CorrespondingNodeComparer;
import net.gronostay.grobtree.api.resources.ResourceProvider;

import java.awt.*;

/**
 * A node directly attached to the root node.
 */
public interface TopLogNode extends SimpleLogNode {
    /**
     * @param color Set the color of the top node.
     *              See also {@link ResourceProvider} for getting colors.
     */
    void setColor(Color color);

    /**
     * @param correspondingNodeComparer Set a CorrespondingNodeComparer to highlight corresponding nodes.
     */
    void setCorrespondingNodeComparer(CorrespondingNodeComparer correspondingNodeComparer);

    /**
     * Add a description String to be shown at the end of the top node caption in "[]". E.g. [200].
     *
     * @param description The String to be added.
     */
    void addDescription(String description);

    /**
     * Add a description String to be shown at the end of the top node caption in "[]". E.g. [200].
     *
     * @param description The String to be added.
     * @param order       The order of ths description. Descriptions will be shown in order.
     */
    void addDescription(String description, int order);
}
