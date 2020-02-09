package com.isuru.model;

import com.isuru.util.Constant;

public class Clownfish extends Fish{

    Clownfish(String bodySize,String bodyColor){
        super(bodySize,bodyColor);
    }

    public String makeJokes(){
        String output = Constant.I_AM_JOKING;
        System.out.println(output);
        return output;
    }
}
