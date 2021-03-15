package com.javacource.se.lesson5;

public final class Singleton {
    private static Singleton instance;  
    public String value;

 // you cannot create singleton instance unless,
 //	you use getInstance method
    
    private Singleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {  
        if (instance == null) { // if this method wasn't used before, then
            instance = new Singleton(value); // we create first and only one instance with "value" inside
        }
        return instance;
    }
}