package net.gronostay.grobtree.api.context;

import net.gronostay.grobtree.api.config.ConfigValueFactory;
import net.gronostay.grobtree.api.resources.ExStringFactory;
import net.gronostay.grobtree.api.resources.ResourceProvider;

/**
 * GlobalContext gives access to resources that are global and not specifically belonging to the current tab, which are accessible through LocalContext.
 * Use GlobalContextProvider.getContext to get an instance.
 */
public interface GlobalContext {
    ResourceProvider getResourceProvider();

    ConfigValueFactory getConfigValueFactory();

    ExStringFactory getExStringFactory();
}