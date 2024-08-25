package net.gronostay.grobtree.api.global;

import net.gronostay.grobtree.api.Global;

public interface Local {
    Global getGlobal();

    Variables getVariables();
}