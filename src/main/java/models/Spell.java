package models;

public class Spell {
    private int id;
    private String name;
    private int damage;
    private Mage mage;

    public Spell() {

    }

    public Spell(String name, int damage, Mage mage) {
        this.name = name;
        this.damage = damage;
        this.mage = mage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Mage getMage() {
        return mage;
    }

    public void setMage(Mage mage) {
        this.mage = mage;
    }
}