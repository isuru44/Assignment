package com.isuru.model;

import com.isuru.util.Constant;

public class Bird extends Animal{

    public String sing() {
        String output = Constant.I_AM_SINGING;
        System.out.println(output);
        return output;
    }
}
