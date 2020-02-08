package com.isuru.model;

import com.isuru.util.SoundEnum;

public class Rooster extends Chicken{
    @Override
    public String sing() {
        String output = SoundEnum.ROOSTER.getSound();
        System.out.println(output);
        return output;
    }
}
