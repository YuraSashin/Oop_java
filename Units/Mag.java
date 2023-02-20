public class Mag extends Characters {
    private int mana_max = 100;
    int mana;
    public Mag(String name, int hp, int maxHp, int minAttack, int maxAttack, int armor,int speed){
        super(name, hp, maxHp, minAttack, maxAttack,armor, speed);
}
    public Mag(String name){
        super(name, 30,30,5, 17,12, 9);
        super.name = name;
    }

    @Override
    public void step(){
        super.step();
    }

    @Override
    public String getinfo(){
        return "Я Маг";
    }
}
