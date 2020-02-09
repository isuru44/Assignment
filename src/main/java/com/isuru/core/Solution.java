package com.isuru.core;


import com.isuru.helper.SoundHelper;
import com.isuru.model.*;
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

        System.out.println("----Start Animal Count----");
        Animal[] animals = new Animal[]{
                new Bird(),new Duck(),new Chicken(),new Rooster(),new Parrot(),new Fish(),new Shark(),
                new Clownfish(),new Dolphin(),new Frog(),new Dog(),new Butterfly(),new Cat() };
        AnimalCount animalCount = new AnimalCount(animals);
        System.out.println("Flying Count : "+animalCount.getFlyingCount());
        System.out.println("Walking Count : "+animalCount.getWalkingCount());
        System.out.println("Swimming Count : "+animalCount.getSwimmingCount());
        System.out.println("Shouting Count : "+animalCount.getShoutingCount());
        System.out.println("Singing Count : "+animalCount.getSingingCount());
        System.out.println("----End Animal Count----");

    }
}
