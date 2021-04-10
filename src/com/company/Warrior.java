package com.company;

public class Warrior extends Hero{

    @Override
    public void applySuperAbility(String superAbilityType) {
        superAbilityType = "Warrior применил суперспособность CRITICAL DAMAGE";
        System.out.println(superAbilityType);
    }
}
