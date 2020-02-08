package com.isuru.core;


import com.isuru.helper.SoundHelper;
import com.isuru.model.Bird;
import com.isuru.model.Parrot;
import com.isuru.util.SoundEnum;

public class Solution {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.sing();

        SoundHelper soundHelper = new SoundHelper();
        soundHelper.setSound(SoundEnum.CAT);
        Bird parrot = new Parrot(soundHelper);
        parrot.sing();
    }
}
