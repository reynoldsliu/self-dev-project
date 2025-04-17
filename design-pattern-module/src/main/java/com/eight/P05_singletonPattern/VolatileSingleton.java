package com.eight.P05_singletonPattern;

import java.util.Objects;

public class VolatileSingleton {

    private volatile static VolatileSingleton uniqueInstance;

    private VolatileSingleton(){}

    /**
     * 當uniqueInstance變數被初始化成單例實例時，
     * volatile關鍵字可以確保多個執行緒正確地處理uniqueInstance變數
     *
     * @return Singleton
     */
    public static VolatileSingleton getInstance(){
        if(Objects.isNull(uniqueInstance)){// 檢查是否有實例
            synchronized (VolatileSingleton.class){// 僅在第一次呼叫此方法時進入同步
                if(Objects.isNull(uniqueInstance)){// 再次檢查 若仍是null 則建立一個實例
                    uniqueInstance = new VolatileSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
