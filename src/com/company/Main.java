package com.company;

import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Hero[] listOfHeroes = createHeroes();
        String defenceOfBoss = defence(listOfHeroes);

        Boss b1 = new Boss();
        b1.setBossDamage(50);
        b1.setBossHealth(900);
        b1.setBossDefenceType(defenceOfBoss);

        System.out.println("Boss health is "+
                b1.getBossHealth()+"; damage is "+b1.getBossDamage()+
                "; defence is "+b1.getBossDefenceType());


        for (Hero hero:listOfHeroes) {
            System.out.println("Hero's attack type is "+ hero.getHeroesAttackType()+"; health is "+
                    hero.getHeroesHealth()+"; damage is "+hero.getHeroesDamage());
        }
    }

    public static Hero[] createHeroes(){
        Hero h1 = new Hero("Physical",20,260);
        Hero h2 = new Hero(30, 270);
        h2.setHeroesAttackType("Magical");
        Hero h3 = new Hero("Kinetic", 10, 280);

        Hero[] heroesList = {h1, h2, h3};
        return heroesList;
    }

    public static String defence(Hero[] list){
        Random rd = new Random();
        int random = rd.nextInt(3);
        return list[random].getHeroesAttackType();

    }
}
