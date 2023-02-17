public class Crossbowman extends Characters{
    int arrows;

    public Crossbowman(String name, int hp, int attack, int speed){
        super(name, hp, attack, speed);
    }

    public Crossbowman(String name){
        super(name, 250, 35,10);
        super.name = name;
    }

    @Override
    public void step(){
        super.step();
    }

    @Override
    public String getinfo(){
        return "Я арбалетчик";
    }
}
