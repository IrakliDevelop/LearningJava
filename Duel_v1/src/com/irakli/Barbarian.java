package com.irakli;

public class Barbarian extends PlayableCharacter {
    private String name = "Barbarian";
    private double hitpoints = 150;
    private double armor = 20;
    private double weapon = 50;
    private boolean defence = false;

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



    @Override
    public double attack(double weapon, double opponentArmor, double opponentHitpoints) {
        double newWeapon = weapon - (weapon*(10/100));

        double rest = newWeapon - opponentArmor;

        if (rest > 0){
            opponentHitpoints -= rest;
            return opponentHitpoints;
        } else {
            opponentArmor -= weapon;
            return  opponentArmor;
        }
    }

}
