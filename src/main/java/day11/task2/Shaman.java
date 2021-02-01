package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack {

    private int magicAtt = 15;

    public Shaman(){
        setPhysAttack(10);
        setPhysDef(0.2);
        setMagicDef(0.2);
    }

    public void healHimself(){
        int recover = 50;
        if (getHealth() + recover < 100){
        setHealth(getHealth() + recover);}
    else {
        setHealth(100);
    }

    }
    public void healTeammate(Hero hero){
        int recover = 30;
        if(hero.getHealth() + recover > 100){
            hero.setHealth(100);
        } else {
            hero.setHealth(getHealth() + recover);
        }

    }
    public void magicalAttack(Hero opponent){
        double damage = magicAtt * (1 - opponent.getMagicDef());
        if(opponent.getHealth() - damage < 0){
            opponent.setHealth(0);
        }
        else {
            opponent.setHealth((int) (opponent.getHealth() - damage));
        }
    }
    public String toString() {
        return "Shaman{" + "health=" + getHealth() + '}';
    }

}
