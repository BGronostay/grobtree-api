package net.gronostay.grobtree.api.processing;

public interface StatisticsProvider {
    void startCollectingStatistics();
    void stopCollectingStatistics();
    String getStatistics();
}