package com.example.wencw_liu.appworks_android;

/**
 * Created by WenCW_Liu on 2018/2/11.
 */
public class Human {
    /**
     * *************** Tips ****************
     * Jobs: Hunter, Warrior, Mage
     * Weapons and Skills:
     * -----------------------------------
     * | Default Blade | Slash |
     * | Fire Blade | Fire Slash |
     * | Ice Blade | Ice Slash |
     * -----------------------------------
     * | Default Bow | Arrow |
     * | Fire Bow | Fire Arrow |
     * | Ice Bow | Ice Arrow |
     * -----------------------------------
     * | Default Staff | Arcane Missiles |
     * | Fire Staff | Fireball |
     * | Ice Staff | Frostbolt |
     * -----------------------------------
     */
    private String name;
    public final static int FIRE_BOW = 0x01;
    public final static int ICE_BOW = 0x02;

    public Human() {
    }

    public void attack() {
        System.out.println("Fist Attack!");
    }
}

class Hunter extends Human {
    public void attackByBow() {
        // override Human's attack
        System.out.println("Hunter Attack with arrow!");
    }

    public void attackByFireBow() {
        // override Human's attack
        System.out.println("Hunter attack with fire arrow!");
    }

}

class Warrior extends Human {
    public void attackByBlade() {
        // override Human's attack
        System.out.println("Warrior attack with Blade!");
    }

    public void attackByFireBlade() {
        // override Human's attack
        System.out.println("Warrior attack with fire Blade!");
    }
}

class Mage extends Human {
    public void attackByStaff() {
        // override Human's attack
        System.out.println("Mage attack with staff!");
    }

    public void attackByFireStaff() {
        // override Human's attack
        System.out.println("Mage attack with fire Staff!");
    }

}
