package net.gronostay.grobtree.api.processing;

import net.gronostay.grobtree.api.config.ConfigValueFactory;
import net.gronostay.grobtree.api.helper.JSONHelper;
import net.gronostay.grobtree.api.resources.ExStringFactory;
import net.gronostay.grobtree.api.resources.ResourceProvider;

public interface Initializer {

    ResourceProvider getResourceProvider();

    ExStringFactory getExStringFactory();

    ConfigValueFactory getConfigValueFactory();

    JSONHelper getJSONHelper();
}
