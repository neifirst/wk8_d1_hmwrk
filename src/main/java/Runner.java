import db.DBHelper;
import models.Mage;
import models.Spell;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Mage mage1 = new Mage("Jeff", "Bridges");
        DBHelper.save(mage1);

        Mage mage2 = new Mage("Susan", "Sarandon");
        DBHelper.save(mage2);

        Spell spell1 = new Spell("Magic Missile", 20, mage1);
        DBHelper.save(spell1);
        System.out.println("New Spell ID: " + spell1.getId());

        Spell spell2 = new Spell("Melf's Acid Arrow", 25, mage2);
        DBHelper.save(spell2);
        System.out.println("New Spell ID: " + spell2.getId());

        DBHelper.delete(spell1);

        spell2.setDamage(40);
        DBHelper.save(spell2);


        List<Spell> spells = DBHelper.getAll("Spell");

        List<Mage> mages = DBHelper.getAll("Mage");

        List<Spell> spellsOfMage1 = DBHelper.getSpells(mage1.getId());

        List<Spell> spellsOfMage2 = DBHelper.getSpells(mage2.getId());

        Object foundObject1 = DBHelper.getObjectById("Mage", 2);

        Object foundObject2 = DBHelper.getObjectById("Spell", 2);

    }
}
