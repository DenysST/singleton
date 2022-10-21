package com.company;

public class EarlyInitThreadSaveSingleton {
    private static final EarlyInitThreadSaveSingleton instance = new EarlyInitThreadSaveSingleton();

    public static EarlyInitThreadSaveSingleton getInstance() {
        return instance;
    }
}
