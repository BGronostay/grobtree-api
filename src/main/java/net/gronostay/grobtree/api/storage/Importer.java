package net.gronostay.grobtree.api.storage;

public interface Importer {
    /** Wether or not the LogProvider shall reverse the order of the generated messages.
     * @return True if the flag to be reversed is active.
     */
    boolean isReverse();

    /**
     * Can (additionally) be called to execute the transformations that were selected in the import dialog. The log in LogProviderListener::provide is already transformed (if selected).
     *
     * @param input The string to be transformed
     * @return the transformed string
     */
    String transform(String input);

    boolean fitsRegEx(String input);
}
