package ru.pavel2107.otus.service;

public interface TransmitterService {
    void printResource( String... args);
    void printlnResource( String... args);
    void printString( String str);
    void printlnString( String str);
    String  getString();
    int     getInt();
}


