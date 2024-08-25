package net.gronostay.grobtree.api;

import net.gronostay.grobtree.api.config.ConfigValueFactory;
import net.gronostay.grobtree.api.resources.ExStringFactory;
import net.gronostay.grobtree.api.resources.ResourceProvider;

public interface Global {
    ResourceProvider getResourceProvider();

    ConfigValueFactory getConfigValueFactory();

    ExStringFactory getExStringFactory();
}