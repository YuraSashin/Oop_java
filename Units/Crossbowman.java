import java.util.ArrayList;

public class Crossbowman extends Characters{
    int arrows;//Стрелы

    public Crossbowman(String name, int hp, int maxHp, int minAttack, int maxAttack, int armor, int speed, int x, int y){
        super(name, hp, maxHp, minAttack, maxAttack,armor, speed, x, y);
    }

    public Crossbowman(String name, int x, int y){
        super(name, 10, 10,3,6,3,4,x,y);
        super.name = name;
    }

    @Override
    public void step(ArrayList<Characters> team1, ArrayList<Characters> team2){
    }

    @Override
    public String getinfo(){
        return "Я арбалетчик";
    }
}
