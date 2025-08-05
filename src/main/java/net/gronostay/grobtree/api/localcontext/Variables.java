package net.gronostay.grobtree.api.localcontext;

public interface Variables {
    String getValue(String variableName);
    String getValueOrElse(String variableName, String elseValue);
}