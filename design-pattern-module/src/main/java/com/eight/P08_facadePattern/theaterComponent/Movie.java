package com.eight.P08_facadePattern.theaterComponent;

import java.util.Objects;

public class Movie {
    String title;
    public String toString(){
        if(Objects.nonNull(this.title)){
            return this.title;
        }
        return "Princess White.";
    }
}
