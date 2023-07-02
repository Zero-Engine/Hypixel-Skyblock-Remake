package me.adarsh.godspunkycore.features.item.weapon;

import me.adarsh.godspunkycore.features.item.*;

public class InkWand implements ToolStatistics, MaterialFunction, Ability {

    @Override
    public String getDisplayName() {
        return "Ink Wand";
    }

    @Override
    public int getAbilityCooldownTicks() {
        return 1200;
    }

    @Override
    public int getManaCost() {
        return 60;
    }

    @Override
    public String getAbilityName() {
        return "Inc Bomb";
    }

    @Override
    public String getAbilityDescription() {
        return "Shoot an ink bomb in front of you dealing\n" +
                "10,000 damage and giving Blindness!";
    }

    @Override
    public int getBaseDamage() {
        return 130;
    }

    @Override
    public double getBaseStrength() {
        return 90;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.WEAPON;
    }

    @Override
    public SpecificItemType getSpecificType() {
        return SpecificItemType.SWORD;
    }

    @Override
    public String getLore() {
        return null;
    }
}