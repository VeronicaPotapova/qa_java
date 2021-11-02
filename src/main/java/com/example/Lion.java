package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;

    private Feline feline;

    public Lion(Feline feline, String sex) throws Exception {

        if (feline == null) {
            throw  new Exception("Передайте экземпляр объекта Feline");
        }
        this.feline = feline;

        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }


    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}