public class Player2 extends Player1 {
    private int health;
    private Boolean armour;


    public Player2(String name, String weapon, int health) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    @Override
    public void damageByGun1() {
        if (armour) {
            this.health -= 20;
            if (health <= 0) {
                this.health = 0;
            }
            System.out.println("Armour is on. Got hit by Gun 1, health is reduced by 20. New health is " + this.health);
        }
        if (!armour) {
            this.health -= 30;
            if (health <= 0) {
                this.health = 0;
            }
            System.out.println("Armour is on. Got hit by Gun 1, health is reduced by 30. New health is " + this.health);
        }
        if (this.health == 0) {
            System.out.println(getName() + " is dead");
        }
    }

    @Override
    public void damageByGun2() {
        if (armour) {
            this.health -= 40;
            if (health <= 0) {
                this.health = 0;
            }
            System.out.println("Armour is on. Got hit by Gun 2, health is reduced by 40. New health is " + this.health);
        }
        if (!armour) {
            this.health -= 50;
            if (health <= 0) {
                this.health = 0;
            }
            System.out.println("Armour is on. Got hit by Gun 2, health is reduced by 50. New health is " + this.health);
        }
        if (this.health == 0) {
            System.out.println(getName() + " is dead");
        }
    }
}