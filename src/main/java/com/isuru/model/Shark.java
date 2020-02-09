package com.isuru.model;

import com.isuru.util.Constant;

public class Shark extends Fish{

    public Shark(){}

    public Shark(String bodySize,String bodyColor){
      super(bodySize,bodyColor);
    }

    @Override
    public String eat(){
        String output = Constant.I_AM_EATING_FISH;
        System.out.println(output);
        return output;
    }
}
