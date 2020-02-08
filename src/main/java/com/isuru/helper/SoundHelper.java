package com.isuru.helper;

import com.isuru.util.SoundEnum;

public class SoundHelper {

    private SoundEnum soundEnum;

    public void setSound(SoundEnum soundEnum){
        this.soundEnum = soundEnum;
    }

    public String makeSound() {
        String sound = soundEnum.getSound();
        return sound;
    }
}
