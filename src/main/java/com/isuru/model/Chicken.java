package com.isuru.model;

import com.isuru.util.SoundEnum;

public class Chicken extends Bird{
    @Override
    public String sing() {
        String output = SoundEnum.CHICKEN.getSound();
        System.out.println(output);
        return output;
    }
}
