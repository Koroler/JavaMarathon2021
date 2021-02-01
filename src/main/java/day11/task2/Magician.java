package day11.task2;

public class Magician extends Hero implements MagicAttack{

    private int magicAtt = 20;

    public Magician(){
        setPhysAttack(5);
        setPhysDef(0);
        setMagicDef(0.8);
    }

    public void magicalAttack(Hero opponent){ double damage = magicAtt * (1 - opponent.getMagicDef());
        if(opponent.getHealth() - damage < 0){
            opponent.setHealth(0);
        }
        else {
            opponent.setHealth((int) (opponent.getHealth() - damage));
        }
    }
    public String toString() {
        return "Magician{" + "health=" + getHealth() + '}';
    }


}
