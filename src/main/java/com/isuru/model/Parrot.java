package com.isuru.model;

import com.isuru.behaviors.Flyable;
import com.isuru.helper.SoundHelper;
import com.isuru.util.Constant;

public class Parrot extends Bird implements Flyable {

    SoundHelper soundHelper;

    public Parrot(){}

    public Parrot(SoundHelper soundHelper) {
        this.soundHelper = soundHelper;
    }

    @Override
    public String sing() {
        String output = soundHelper.makeSound();
        System.out.println(output);
        return output;
    }

    public String fly() {
        String output = Constant.I_AM_FLYING;
        System.out.println(output);
        return output;
    }
}
