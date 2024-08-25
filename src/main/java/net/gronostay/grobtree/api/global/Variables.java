package net.gronostay.grobtree.api.global;

public interface Variables {
    String getValueOrElse(String variableName, String elseValue);
}