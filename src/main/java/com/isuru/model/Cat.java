package com.isuru.model;

import com.isuru.util.SoundEnum;

public class Cat extends Mammal{

    public String shout(){
        String output = SoundEnum.CAT.getSound();
        System.out.println(output);
        return output;
    }
}
