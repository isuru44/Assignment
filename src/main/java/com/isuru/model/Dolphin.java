package com.isuru.model;

import com.isuru.behaviors.Swimmable;
import com.isuru.util.Constant;

public class Dolphin extends Animal implements Swimmable {

    public String swim() {
        String output = Constant.I_AM_SWIMMING;
        System.out.println(output);
        return output;
    }
}
