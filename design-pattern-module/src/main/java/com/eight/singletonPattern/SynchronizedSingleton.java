package com.eight.singletonPattern;

import java.util.Objects;

public class SynchronizedSingleton {

    private static SynchronizedSingleton uniqueInstance;

    private SynchronizedSingleton(){

    }

    /**
     * 防止多執行緒重複建立實例
     *
     * @return Singleton
     */
    public static synchronized SynchronizedSingleton getInstance(){
        if(Objects.isNull(uniqueInstance)){
            uniqueInstance = new SynchronizedSingleton();
        }
        return uniqueInstance;
    }
}
