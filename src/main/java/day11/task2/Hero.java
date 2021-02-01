package day11.task2;

public abstract class Hero {

    private int health;
    private int physAtt;
    private double physDef;
    private double magicDef;

    public int getHealth() { return health; }
    public int getPhysAttack() { return physAtt; }
    public double getPhysDef() {
        return physDef;
    }
    public double getMagicDef() {
        return magicDef;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void setPhysAttack(int physAttack) { this.physAtt = physAttack; }
    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }
    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    public Hero(){
        this.health = 100;
    }

    public void PhysAttack(Hero opponent){
        double damage = physAtt * (1 - opponent.physDef);
        if(opponent.health - damage < 0){
            opponent.health = 0;
        }
        else {
            opponent.health -= damage;
        }

    }

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                '}';
    }
}
