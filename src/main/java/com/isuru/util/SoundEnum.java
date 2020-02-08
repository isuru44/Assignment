package com.isuru.util;

public enum SoundEnum {
    DUCK("Quack,quack"),
    CHICKEN("Cluck,cluck"),
    ROOSTER("Cock-a-doodle-doo"),
    DOG("Woof,woof"),
    CAT("Meow"),
    DEFALT("I am singing");

    private String sound;

    SoundEnum(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
