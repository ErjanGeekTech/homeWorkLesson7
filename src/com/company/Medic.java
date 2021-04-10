package com.company;

public class Medic extends Hero{
    @Override
    public void applySuperAbility(String superAbilityType) {
        superAbilityType = "Medic применил суперспособность CRITICAL DAMAGE";
        System.out.println(superAbilityType);
    }
}
