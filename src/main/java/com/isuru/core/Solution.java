package com.isuru.core;


import com.isuru.helper.SoundHelper;
import com.isuru.model.Bird;
import com.isuru.model.Butterfly;
import com.isuru.model.Parrot;
import com.isuru.util.SoundEnum;

public class Solution {

    public static void main(String[] args) {

        System.out.println("----Start Parrot with Cat----");
        SoundHelper soundHelper = new SoundHelper();
        soundHelper.setSound(SoundEnum.CAT);
        Bird parrot = new Parrot(soundHelper);
        parrot.sing();
        System.out.println("----End Parrot with Cat----");

        System.out.println("----Start Butterfly----");
        Butterfly butterfly = new Butterfly();
        butterfly.fly();
        butterfly.walk();
        butterfly.transform();
        butterfly.fly();
        butterfly.walk();
        System.out.println("----End Butterfly----");
    }
}
