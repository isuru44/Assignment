package com.isuru.model;

import com.isuru.util.Constant;

abstract class Animal {

    public String eat(){
        String output = Constant.I_AM_EATING;
        System.out.println(output);
        return output;
    }

}
