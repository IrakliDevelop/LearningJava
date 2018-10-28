package com.irakli;

public class Legionary extends PlayableCharacter {
    private String name = "Legionary";
    private double hitpoints = 100;
    private double armor = 100;
    private double weapon = 30;
    private boolean defence = true;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getHitpoints() {
        return hitpoints;
    }

    @Override
    public double getArmor() {
        return armor;
    }

    @Override
    public double getWeapon() {
        return weapon;
    }

    @Override
    public boolean isDefence() {
        return defence;
    }

    @Override
    public void setHitpoints(double hitpoints) {
        this.hitpoints = hitpoints;
    }

    @Override
    public void setArmor(double armor) {
        this.armor = armor;
    }



}
