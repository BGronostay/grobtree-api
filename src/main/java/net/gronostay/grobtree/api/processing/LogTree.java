package net.gronostay.grobtree.api.processing;

import net.gronostay.grobtree.api.nodes.TopLogNode;
import net.gronostay.grobtree.api.nodes.correspondingnode.CorrespondingNodeComparer;
import net.gronostay.grobtree.api.resources.ExString;
import net.gronostay.grobtree.api.resources.ResourceProvider;

import javax.swing.*;

/**
 * Interface for adding top nodes to the root node.
 */
public interface LogTree {
    /**
     * Add a top node to the log tree.
     *
     * @param caption The caption of the top node to be added - something that describes the new node.
     * @param value   The value of the top node to be added - most likely the text from {@link ProcessingListener}.
     * @return The added node.
     */
    TopLogNode addTopNode(String caption, String value);

    /**
     * Add a top node to the log tree.
     *
     * @param caption The caption of the top node to be added - something that describes the new node.
     * @param value   The value of the top node to be added - most likely the text from {@link ProcessingListener}.
     * @param icon    The icon of the top node to be added. Could be null. See {@link ResourceProvider}.
     * @return The added node.
     */
    TopLogNode addTopNode(String caption, String value, Icon icon);

    /**
     * Add a top node to the log tree.
     *
     * @param caption  The caption of the top node to be added - something that describes the new node.
     * @param value    The value of the top node to be added - most likely the text from {@link ProcessingListener}.
     * @param icon     The icon of the top node to be added. Could be null. See {@link ResourceProvider}.
     * @param comparer Provide information to automatically find corresponding nodes (e.g. response for request).
     * @return The added node.
     */
    TopLogNode addTopNode(String caption, String value, Icon icon, CorrespondingNodeComparer comparer);

    /**
     * Add a top node to the log tree.
     *
     * @param caption The caption of the top node to be added - something that describes the new node.
     * @param value   The value of the top node to be added - most likely the text from {@link ProcessingListener}.
     * @return The added node.
     */
    TopLogNode addTopNode(ExString caption, String value);

    /**
     * Add a top node to the log tree.
     *
     * @param caption The caption of the top node to be added - something that describes the new node.
     * @param value   The value of the top node to be added - most likely the text from {@link ProcessingListener}.
     * @param icon    The icon of the top node to be added. Could be null. See {@link ResourceProvider}.
     * @return The added node.
     */
    TopLogNode addTopNode(ExString caption, String value, Icon icon);

    /**
     * Add a top node to the log tree.
     *
     * @param caption  The caption of the top node to be added - something that describes the new node.
     * @param value    The value of the top node to be added - most likely the text from {@link ProcessingListener}.
     * @param icon     The icon of the top node to be added. Could be null. See {@link ResourceProvider}.
     * @param comparer Provide information to automatically find corresponding nodes (e.g. response for request).
     * @return The added node.
     */
    TopLogNode addTopNode(ExString caption, String value, Icon icon, CorrespondingNodeComparer comparer);
}
