package com.isuru.core;

import com.isuru.helper.SoundHelper;
import com.isuru.model.*;
import com.isuru.util.Constant;
import com.isuru.util.SoundEnum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void singTest() {
        String birdOutput = new Bird().sing();
        assertEquals(SoundEnum.DEFALT.getSound(), birdOutput);

        String duckOutput = new Duck().sing();
        assertEquals(SoundEnum.DUCK.getSound(), duckOutput);

        String chickenOutput = new Chicken().sing();
        assertEquals(SoundEnum.CHICKEN.getSound(), chickenOutput);

        SoundHelper soundHelper = new SoundHelper();

        //who loving with dog
        soundHelper.setSound(SoundEnum.DOG);
        String parrot1Output = new Parrot(soundHelper).sing();
        assertEquals(SoundEnum.DOG.getSound(), parrot1Output);

        //who loving with cat
        soundHelper.setSound(SoundEnum.CAT);
        String parrot2Output = new Parrot(soundHelper).sing();
        assertEquals(SoundEnum.CAT.getSound(), parrot2Output);

        //who loving with rooster
        soundHelper.setSound(SoundEnum.ROOSTER);
        String parrot3Output = new Parrot(soundHelper).sing();
        assertEquals(SoundEnum.ROOSTER.getSound(), parrot3Output);

        //who loving with duck
        soundHelper.setSound(SoundEnum.DUCK);
        String parrot4Output = new Parrot(soundHelper).sing();
        assertEquals(SoundEnum.DUCK.getSound(), parrot4Output);
    }

    @Test
    public void flyTest(){
        String duckOutput = new Duck().fly();
        assertEquals(Constant.I_AM_FLYING, duckOutput);

    }

    @Test
    public void butterflyTest(){

        //Butterfly in catepiller state
        Butterfly btf = new Butterfly();
        assertEquals(Constant.I_CANT_FLYING,btf.fly());
        assertEquals(Constant.I_AM_WALKING,btf.walk());
        btf.transform();
        //now Butterfly in butterfly state
        assertEquals(Constant.I_AM_FLYING,btf.fly());
        assertEquals(Constant.I_CANT_WALKING,btf.walk());
    }

    @Test
    public void animalCountTest(){
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Frog(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };
        AnimalCount animalCount = new AnimalCount(animals);

        assertEquals(animalCount.getFlyingCount(), 3);
        assertEquals(animalCount.getShoutingCount(), 3);
        assertEquals(animalCount.getSingingCount(), 5);
        assertEquals(animalCount.getWalkingCount(), 9);
        assertEquals(animalCount.getSwimmingCount(), 6);
    }

    @Test
    public void swimTest(){
        assertEquals(new Duck().swim(), Constant.I_AM_SWIMMING);
        assertEquals(new Fish().swim(), Constant.I_AM_SWIMMING);
        assertEquals(new Frog().swim(), Constant.I_AM_SWIMMING);
    }

    @Test
    public void walkTest(){
        assertEquals(new Duck().walk(), Constant.I_AM_WALKING);
        assertEquals(new Cat().walk(), Constant.I_AM_WALKING);
        assertEquals(new Frog().walk(), Constant.I_AM_WALKING);
        assertEquals(new Dog().walk(), Constant.I_AM_WALKING);
        assertEquals(new Parrot().walk(), Constant.I_AM_WALKING);
        assertEquals(new Chicken().walk(), Constant.I_AM_WALKING);
    }
}
