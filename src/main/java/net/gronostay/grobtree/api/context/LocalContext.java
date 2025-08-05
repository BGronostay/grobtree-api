package net.gronostay.grobtree.api.context;

import net.gronostay.grobtree.api.localcontext.Icons;
import net.gronostay.grobtree.api.localcontext.Variables;

/**
 * LocalContext gives access to values of the current tab (configured in XML). This is in opposite to GlobalContext.
 *  Use LocalContextProvider.getContext to get an instance.
 */
public interface LocalContext {
    GlobalContext getGlobal();

    Icons getIcons();
    Variables getVariables();
}