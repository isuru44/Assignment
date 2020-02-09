package com.isuru.model;

import com.isuru.behaviors.Shoutable;
import com.isuru.behaviors.Swimmable;
import com.isuru.behaviors.Walkable;
import com.isuru.util.Constant;
import com.isuru.util.SoundEnum;

public class Frog extends Animal implements Walkable, Swimmable, Shoutable {
    public String shout() {
        String output = SoundEnum.CAT.getSound();
        System.out.println(output);
        return output;
    }

    public String swim() {
        String output = Constant.I_AM_SWIMMING;
        System.out.println(output);
        return output;
    }

    public String walk() {
        String output = Constant.I_AM_WALKING;
        System.out.println(output);
        return output;
    }
}
