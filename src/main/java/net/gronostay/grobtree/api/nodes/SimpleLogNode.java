package net.gronostay.grobtree.api.nodes;

import net.gronostay.grobtree.api.processing.ProcessingListener;

import javax.swing.*;
import java.util.List;

/**
 * Interface for every node, top nodes and child nodes.
 */
public interface SimpleLogNode {
    /**
     * Set the NodeFileType of the node.
     *
     * @param nodeFileType to be set
     */
    void setNodeFileType(NodeFileType nodeFileType);

    /**
     * Set the icon of the node.
     *
     * @param icon to be set
     */
    void setIcon(Icon icon);

    // ---------------------------------------------

    /**
     * Store any custom object.
     *
     * @param customObject The object to be stored.
     */
    void setCustomObject(Object customObject);

    /**
     * Retrieve a stored object.
     *
     * @return The formerly stored object or null.
     */
    Object getCustomObject();

    // ---------------------------------------------

    /**
     * Create a child node.
     *
     * @param caption      The caption of the child node to be added - something that describes the new node.
     * @param value        The value of the child node to be added - most likely the text from {@link ProcessingListener}.
     * @param nodeFileType The nodeFileType of the child node to be added.
     * @param icon         The icon of the child node to be added.
     * @return The added node.
     */
    SimpleLogNode createChild(String caption, String value, NodeFileType nodeFileType, Icon icon);

    /**
     * Create a child node.
     *
     * @param caption The caption of the child node to be added - something that describes the new node.
     * @param value   The value of the child node to be added - most likely the text from {@link ProcessingListener}.
     * @return The added node.
     */
    SimpleLogNode createChild(String caption, String value);

    /**
     * Create a child node with caption only.
     *
     * @param caption The caption of the child node to be added - something that describes the new node.
     * @return The added node.
     */
    SimpleLogNode createCaptionOnlyChild(String caption);

    // ---------------------------------------------

    /**
     * Sets the caption as "key:value"
     *
     * @param key          The key.
     * @param value        The value of the child node to be added - most likely the text from {@link ProcessingListener}.
     * @param nodeFileType The nodeFileType of the child node to be added.
     * @param icon         The icon of the child node to be added.
     * @return The added node.
     */
    SimpleLogNode createKeyValueChild(String key, String value, NodeFileType nodeFileType, Icon icon);

    /**
     * Sets the caption as "key:value"
     *
     * @param key   The key.
     * @param value The value of the child node to be added - most likely the text from {@link ProcessingListener}.
     * @return The added node.
     */
    SimpleLogNode createKeyValueChild(String key, String value);

    // ---------------------------------------------

    /**
     * Create child nodes for every entry of a value string (e.g. headers field).
     *
     * @param keyValueString The string to be split in child nodes, e.g. {host=localhost:8081, connection=keep-alive}
     * @return A List of the added nodes.
     */
    List<SimpleLogNode> createKeyValueChildrenFromKeyValueString(String keyValueString);

    // ---------------------------------------------

    /**
     * Create a child node with binary data that can be saved as a file.
     *
     * @param caption     The caption of the child node to be added - something that describes the new node.
     * @param fileName    The name of the file when being saved.
     * @param binaryValue The binary content.
     * @return The added node.
     */
    SimpleLogNode createBinaryChild(String caption, String fileName, byte[] binaryValue);
}
