package day11.task2;

public class Warrior extends Hero {

    public Warrior(){
        setPhysAttack(30);
        setPhysDef(0.8);
        setMagicDef(0);
    }

    public String toString() {
        return "Warrior{" + "health=" + getHealth() + '}';
    }

}
