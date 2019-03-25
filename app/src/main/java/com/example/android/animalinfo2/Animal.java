package com.example.android.animalinfo2;

import java.io.Serializable;

public class Animal implements Serializable {
    String animalName;
    int numberOfLegs;
    String moreInfo;
    boolean hasFur;

    public Animal(String animalName, int numberOfLegs, String moreInfo, boolean hasFur) {
        this.animalName = animalName;
        this.numberOfLegs = numberOfLegs;
        this.moreInfo = moreInfo;
        this.hasFur = hasFur;
    }

    @Override
    public String toString() {
        return String.format("Animal Name: %s\nNumber of Legs: %s\nHas Fur? %s\nAdditional Information: %s", animalName, numberOfLegs, hasFur, moreInfo);

    }
}
