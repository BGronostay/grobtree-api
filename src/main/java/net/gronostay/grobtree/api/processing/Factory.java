package net.gronostay.grobtree.api.processing;

import net.gronostay.grobtree.api.global.Local;

/**
 * A customer implementation can provide a factory that is called when GrobTree wants to create a class that is defined in the ConverterConfig file.
 */
public interface Factory {
    /**
     * Called when a custom class (e.g. ProcessListener) is to be created.
     *
     * @param uniqueName The unique name of the class to be created as stated in the ConverterConfig file.
     * @param local    Access to (tab-)local resources etc.
     * @return The created class.
     */
    Object create(String uniqueName, Local local);
}
