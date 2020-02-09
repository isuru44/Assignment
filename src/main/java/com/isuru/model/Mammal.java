package com.isuru.model;

import com.isuru.behaviors.Shoutable;
import com.isuru.behaviors.Walkable;
import com.isuru.util.Constant;

public abstract class Mammal extends Animal implements Shoutable, Walkable {

    public String walk() {
        String output = Constant.I_AM_WALKING;
        System.out.println(output);
        return output;
    }
}
