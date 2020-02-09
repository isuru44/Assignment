package com.isuru.model;

import com.isuru.util.Constant;

public class Butterfly extends Insect{

    private Insect state = new CaterpillarState();

    public void transform() {
        state = new ButterflyState();
        System.out.println("Transform Caterpillar to Butterfly");
    }

    public String fly() {
        return state.fly();
    }

    public String walk() {
        return state.walk();
    }

    private class ButterflyState extends Insect{
        public String fly() {
            String output = Constant.I_AM_FLYING;
            System.out.println(output);
            return output;
        }

        public String walk() {
            String output = Constant.I_CANT_WALKING;
            System.out.println(output);
            return output;
        }
    }

    private class CaterpillarState extends Insect {
        public String walk() {
            String output = Constant.I_AM_WALKING;
            System.out.println(output);
            return output;
        }

        public String fly() {
            String output = Constant.I_CANT_FLYING;
            System.out.println(output);
            return output;
        }
    }
}
