package com.irakli;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to the duel \n"+
                            "Choose your character");

        Legionary legionary = new Legionary();
        Barbarian barbarian = new Barbarian();


        System.out.println("1.Roman legionary \n" +
                            "\t has good defensive skills, but lacks attacking mindset\n\n");
        System.out.println("2.Barbarian Soldier \n" +
                            "\t furious on attack, but doesn't have a good armor\n\n");


        int selection = scanner.nextInt();

        String player;

        if (selection == 1){
            player = legionary.getName();
        } else {
            player = barbarian.getName();
        }

        boolean gameOver = false;

        while(!gameOver){
            System.out.println("press 1 to attack cpu");
            int sel = scanner.nextInt();
            if (sel == 1){
                if(player.equals(legionary.getName())){
                    fight(legionary,barbarian);
                    System.out.println("You have attacked cpu");
                    if (barbarian.getHitpoints() <= 0){
                        System.out.println("Congratulations, you have defeated your opponent");
                        gameOver = true;
                    }

                    System.out.println("Now cpu is attacking you");
                    fight(barbarian,legionary);
                    if (legionary.getHitpoints() <= 0){
                        System.out.println("You have been defeated by our opponent. Better luck next time :)");
                        gameOver = true;
                    }
                } else{
                    fight(barbarian,legionary);
                    System.out.println("You have attacked cpu");
                    if (legionary.getHitpoints() <= 0){
                        System.out.println("Congratulations, you have defeated your opponent");
                        gameOver = true;
                    }
                    System.out.println("Now cpu is attacking you");
                    fight(legionary,barbarian);
                    if (barbarian.getHitpoints() <= 0){
                        System.out.println("You have been defeated by our opponent. Better luck next time :)");
                        gameOver = true;
                    }
                }
            }
            status(legionary,barbarian);
        }

        System.out.println("Thanks for playing the game, I hope you enjoyed itu");

    }

    public static void fight (PlayableCharacter player, PlayableCharacter cpu){
        double rest = player.getWeapon() - cpu.getArmor();

        if (rest > 0){
            cpu.setHitpoints(player.attack(player.getWeapon(),cpu.getArmor(),cpu.getHitpoints()));
            cpu.setArmor(0);
        } else {
            cpu.setArmor(player.attack(player.getWeapon(),cpu.getArmor(),cpu.getHitpoints()));
        }
    }

    public static void status(Legionary legionary, Barbarian barbarian){
        System.out.println("1.Roman Legoinary: \n"+
                            "Hitpoints: " + legionary.getHitpoints() +
                            "\n armor: " + legionary.getArmor());
        System.out.println("2.Barbarian Soldier: \n"+
                "Hitpoints: " + barbarian.getHitpoints() +
                "\n armor: " + barbarian.getArmor());
    }

}
