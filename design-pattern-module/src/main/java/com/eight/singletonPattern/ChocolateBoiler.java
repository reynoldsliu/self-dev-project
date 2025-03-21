package com.eight.singletonPattern;

import java.util.Objects;

public class ChocolateBoiler {

    private boolean empty;

    private boolean boiled;

    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler(){
        this.empty = true;
        this.boiled = true;
    }

    public static ChocolateBoiler getInstance(){
        if(Objects.isNull(uniqueInstance)){
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    public void fill(){
        if(empty){
            this.empty = false;
            this.boiled = false;
            // 將牛奶/巧克力放入鍋爐裡
        }
    }
    // 其他 ChocolateBoiler 程式
}
