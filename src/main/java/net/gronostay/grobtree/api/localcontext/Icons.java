package net.gronostay.grobtree.api.localcontext;

import javax.swing.*;

public interface Icons {
    Icon getIcon(String iconName);
    Icon getIconOrElse(String iconName, Icon elseIcon);
}