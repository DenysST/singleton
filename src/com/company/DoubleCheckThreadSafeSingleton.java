package com.company;

public class DoubleCheckThreadSafeSingleton {
    private static volatile DoubleCheckThreadSafeSingleton instance;

    private DoubleCheckThreadSafeSingleton() {}

    public static DoubleCheckThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
