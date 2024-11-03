package net.gronostay.grobtree.api.storage;

/**
 * An interface for classes that can provide GrobTree with logs from any source.
 */
public interface LogProviderListener {
    /**
     * Called when Grobtree creates the list of providers.
     *
     * @param logStorageFactory A factory to create internal storages of logs
     * @return the created log storage
     */
    LogStorage provide(LogStorageFactory logStorageFactory, Importer importer, String log);
}
