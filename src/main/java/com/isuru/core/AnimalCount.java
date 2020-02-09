package com.isuru.core;

import com.isuru.behaviors.*;
import com.isuru.model.Animal;

public class AnimalCount {

    private int flyingCount = 0;
    private int walkingCount = 0;
    private int singingCount = 0;
    private int swimmingCount = 0;
    private int shoutingCount = 0;


    public AnimalCount(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Flyable) {
                flyingCount += 1;
            }
            if (animals[i] instanceof Walkable) {
                walkingCount += 1;
            }
            if (animals[i] instanceof Swimmable) {
                swimmingCount += 1;
            }
            if (animals[i] instanceof Singable) {
                singingCount += 1;
            }
            if (animals[i] instanceof Shoutable) {
                shoutingCount += 1;
            }
        }
    }

    public int getFlyingCount() {
        return flyingCount;
    }

    public int getWalkingCount() {
        return walkingCount;
    }

    public int getSingingCount() {
        return singingCount;
    }

    public int getSwimmingCount() {
        return swimmingCount;
    }

    public int getShoutingCount() {
        return shoutingCount;
    }
}
