package com.eight.singletonPattern;

public class StaticSingleton {

    /**
     * 確保永遠只有一個實例
     */
    private static StaticSingleton uniqueInstance = new StaticSingleton();

    private StaticSingleton(){}

    public static StaticSingleton getInstance(){
        return uniqueInstance;
    }
}
