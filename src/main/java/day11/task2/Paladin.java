package day11.task2;

public class Paladin extends Hero implements Healer{

    public Paladin(){
        setPhysAttack(15);
        setPhysDef(0.5);
        setMagicDef(0.2);
    }

    public void healHimself(){
        if (getHealth() + 25 > 100){
            setHealth(100);
        }
        else {
            setHealth(getHealth() + 25);
        }
    }
    public void healTeammate(Hero hero){
        int recover = 10;
        if(hero.getHealth() + recover > 100){
            hero.setHealth(100);
        } else {
            hero.setHealth(getHealth() + recover);
        }

    }
    public String toString() {
        return "Paladin{" + "health=" + getHealth() + '}';
    }

}
