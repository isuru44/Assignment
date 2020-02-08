package com.isuru.model;

import com.isuru.util.SoundEnum;

public class Dog extends Mammal{

    public String shout(){
        String output = SoundEnum.DOG.getSound();
        System.out.println(output);
        return output;
    }
}
