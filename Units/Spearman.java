public class Spearman extends Characters {
    int extraDamage;
    
    public Spearman(String name, int hp, int maxHp, int minAttack, int maxAttack, int armor, int speed){
        super(name, hp, maxHp, minAttack, maxAttack, armor, speed);
    }

    public Spearman(String name){
        super(name, 10,10, 2, 4,5, 4);
        super.name = name;
    }
    @Override
    public void step(){
        super.step();
    }

    @Override
    public String getinfo(){
        return "Я копейщик";
    }

}
