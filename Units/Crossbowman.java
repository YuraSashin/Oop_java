public class Crossbowman extends Characters{
    int arrows;//Стрелы

    public Crossbowman(String name, int hp, int maxHp, int minAttack, int maxAttack, int armor, int speed){
        super(name, hp, maxHp, minAttack, maxAttack,armor, speed);
    }

    public Crossbowman(String name){
        super(name, 10, 10,3,6,3,4);
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
