package com.example.mylib;

public class Human {
    public String name;
    public final static int FIRE_BOW = 0x01;
    public final static int ICE_BOW = 0x02;
    public final static int FIRE_BLADE = 0x01;
    public final static int ICE_BLADE = 0x02;
    public final static int FIRE_BALL = 0x01;
    public final static int ICE_BALL = 0x02;

    public Human(){
        name = "Unknown";
    }

    public Human(String name) {
        this.name = name;
    }

    public void attack () {
        System. out .printf( " %s Fist Attack!%n", this.name) ;
    }

    public static void main(String args[]) {
        Hunter a = new Hunter("Wen");
        a.attack();
        Warrior b = new Warrior("GG");
        b.attack();
        Mage c = new Mage("Wen");
        c.attack();
        Human sad = new Human();
        sad.attack();
    }
}


class Hunter extends Human {
    public Hunter(String name){
        super(name);
    }
    private int weaponType = 0;
    public void attack(){
        String weapon = "";
        if(this.weaponType == FIRE_BOW) {
            weapon = "Fire Bow";
        } else if (this.weaponType == ICE_BOW) {
            weapon = "Ice Bow";
        } else {
            weapon = "Default Bow";
        }
        System.out.printf(" %s Make Attack by %s!%n",this.name ,weapon);
    }
    public void attack(int weaponType) {
        this.weaponType = weaponType;
        this.attack();
    }
}

class Warrior extends Human {
    public Warrior(String name){
        super(name);
    }
    private int weaponType = 0;
    public void attack(){
        String weapon = "";
        if(this.weaponType == FIRE_BLADE ) {
            weapon = "Fire Blade";
        } else if (this.weaponType == ICE_BLADE) {
            weapon = "Ice Blade";
        } else {
            weapon = "Default Blade";
        }
        System.out.printf(" %s Make Attack by %s!\n",this.name ,weapon);
    }
    public void attack(int weaponType) {
        this.weaponType = weaponType;
        this.attack();
    }
}


class Mage extends Human {
    public Mage(String name){
        super(name);
    }
    private int weaponType = 0;
    public void attack(){
        String weapon = "";
        if(this.weaponType == FIRE_BALL ) {
            weapon = "Fire Ball";
        } else if (this.weaponType == ICE_BALL) {
            weapon = "Ice Ball";
        } else {
            weapon = "Missiles";
        }
        System.out.printf(" %s Make Attack by %s!%n", this.name ,weapon);
    }
    public void attack(int weaponType) {
        this.weaponType = weaponType;
        this.attack();
    }
}

