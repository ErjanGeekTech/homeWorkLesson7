package com.company;

public class Magic extends Hero{
    @Override
    public void applySuperAbility(String superAbilityType) {
        superAbilityType = "Magic применил суперспособность CRITICAL DAMAGE";
        System.out.println(superAbilityType);
    }
}
