package com.javacource.se.lesson5;

public class DemoSingleThread {
	 public static void main(String[] args) {
	        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
	                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
	                "RESULT:" + "\n");
	        Singleton singleton = Singleton.getInstance("FOO");
	        Singleton anotherSingleton = Singleton.getInstance("BAR"); // we try to create another singleton
	        System.out.println(singleton.value);
	        System.out.println(anotherSingleton.value); // because instance wasn't null, we just returned already existing singleton
	 }
}
