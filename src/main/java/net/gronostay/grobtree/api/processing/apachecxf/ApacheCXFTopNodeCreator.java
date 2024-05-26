package net.gronostay.grobtree.api.processing.apachecxf;

import net.gronostay.grobtree.api.processing.ProcessingListener;
import net.gronostay.grobtree.api.processing.StatisticsProvider;

import javax.swing.*;
import java.util.Map;

public interface ApacheCXFTopNodeCreator extends ProcessingListener, StatisticsProvider {
    void setContainedAddressToIconMap(Map<String, Icon> containedAddressToIconMap);
    void setPostCreationListener(PostCreationListener postCreationListener);
}