package com.company;

public class Magic extends Hero{
    @Override
    public void applySuperAbility(String superAbilityType) {
        setAbility( "Magic применил суперспособность CRITICAL DAMAGE");
        System.out.println(getAbility());
    }
}
