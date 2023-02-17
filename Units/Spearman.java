public class Spearman extends Characters {
    int extraDamage;
    
    public Spearman(String name, int hp, int attack, int speed){
        super(name, hp, attack, speed);
    }

    public Spearman(String name){
        super(name, 100, 35, 20);
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
