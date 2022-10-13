package com.company;

public class Hero {
    private String heroesAttackType;
    private int heroesDamage;
    private int heroesHealth;

    Hero(String heroesAttackType, int heroesDamage, int heroesHealth){
        this.heroesAttackType=heroesAttackType;
        this.heroesDamage=heroesDamage;
        this.heroesHealth=heroesHealth;

    }

    Hero(int heroesDamage, int heroesHealth){
        this.heroesDamage=heroesDamage;
        this.heroesHealth=heroesHealth;

    }

    public String getHeroesAttackType() {
        return heroesAttackType;
    }

    public int getHeroesDamage() {
        return heroesDamage;
    }

    public int getHeroesHealth() {
        return heroesHealth;
    }

    public void setHeroesAttackType(String heroesAttackType) {
        this.heroesAttackType = heroesAttackType;
    }
}
