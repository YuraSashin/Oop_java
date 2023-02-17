public class Mag extends Characters {
    private int mana_max = 100;
    int mana;
    public Mag(String name, int hp, int attack, int speed){
        super(name, hp, attack, speed);
}
    public Mag(String name){
        super(name, 100, 10, 30);
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
