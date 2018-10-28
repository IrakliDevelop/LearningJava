package com.irakli;

public abstract class PlayableCharacter {
    private String name;
    private double hitpoints;
    private double armor;
    private double weapon;
    private boolean defence;

    public String getName() {
        return name;
    }

    public double getHitpoints() {
        return hitpoints;
    }

    public double getArmor() {
        return armor;
    }

    public double getWeapon() {
        return weapon;
    }

    public boolean isDefence() {
        return defence;
    }

    public void setHitpoints(double hitpoints) {
        this.hitpoints = hitpoints;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public double attack(double weapon, double opponentArmor, double opponentHitpoints){
        double rest = weapon - opponentArmor;

        if (rest > 0){
            opponentHitpoints -= rest;
            return opponentHitpoints;
        } else {
            opponentArmor -= weapon;
            return  opponentArmor;
        }
    }
}
