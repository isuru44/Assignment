package com.isuru.model;

import com.isuru.behaviors.Singable;
import com.isuru.behaviors.Walkable;
import com.isuru.util.Constant;

public class Bird extends Animal implements Walkable, Singable {

    public String sing() {
        String output = Constant.I_AM_SINGING;
        System.out.println(output);
        return output;
    }

    public String walk() {
        String output = Constant.I_AM_WALKING;
        System.out.println(output);
        return output;
    }
}
