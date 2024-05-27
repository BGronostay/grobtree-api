package net.gronostay.grobtree.api;

import net.gronostay.grobtree.api.config.ConfigValueFactory;
import net.gronostay.grobtree.api.processing.Initializer;
import net.gronostay.grobtree.api.resources.ExStringFactory;
import net.gronostay.grobtree.api.resources.ResourceProvider;

/**
 * Class for providing a static instance of common providers.
 */
public class GrobTree {
    private static Initializer INITIALIZER;

    protected GrobTree(Initializer initializer) {
        GrobTree.INITIALIZER = initializer;
    }

    public static ResourceProvider getResourceProvider() {
        return INITIALIZER.getResourceProvider();
    }

    public static ExStringFactory getExStringFactory() {
        return INITIALIZER.getExStringFactory();
    }

    public static ConfigValueFactory getConfigValueFactory() {
        return INITIALIZER.getConfigValueFactory();
    }
}
