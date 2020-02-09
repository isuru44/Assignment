package com.isuru.model;

import com.isuru.behaviors.Flyable;
import com.isuru.behaviors.Swimmable;
import com.isuru.util.Constant;
import com.isuru.util.SoundEnum;

public class Duck extends Bird implements Flyable, Swimmable {

    @Override
    public String sing() {
        String output = SoundEnum.DUCK.getSound();
        System.out.println(output);
        return output;
    }

    public String fly() {
        String output = Constant.I_AM_FLYING;
        System.out.println(output);
        return output;
    }

    public String swim(){
        String output = Constant.I_AM_SWIMMING;
        System.out.println(output);
        return output;
    }
}
