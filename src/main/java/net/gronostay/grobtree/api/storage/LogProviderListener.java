package net.gronostay.grobtree.api.storage;

public interface LogProviderListener {
    LogStorage provide(LogStorageFactory logStorageFactory);
}
