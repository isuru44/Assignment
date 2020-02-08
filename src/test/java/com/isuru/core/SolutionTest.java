package com.isuru.core;

import com.isuru.helper.SoundHelper;
import com.isuru.model.Bird;
import com.isuru.model.Chicken;
import com.isuru.model.Duck;
import com.isuru.model.Parrot;
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
}
