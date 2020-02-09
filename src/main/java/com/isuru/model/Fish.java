package com.isuru.model;

import com.isuru.behaviors.Swimmable;
import com.isuru.util.Constant;

public class Fish extends Animal implements Swimmable {

    private String bodySize;
    private String bodyColor;

    Fish(){}

    Fish(String bodySize,String bodyColor){
        this.bodySize = bodySize;
        this.bodyColor = bodyColor;
    }

    public String swim() {
        String output = Constant.I_AM_SWIMMING;
        System.out.println(output);
        return output;
    }

    public String getBodySize(){
        return this.bodySize;
    }

    public String getBodyColor(){
        return this.bodyColor;
    }

}
