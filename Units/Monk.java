import java.util.ArrayList;

public class Monk extends Characters{
    int treatment;
    
    public Monk(String name, int hp, int maxHp, int minAttack, int maxAttack, int armor, int speed, int x, int y){
        super(name, hp, maxHp, minAttack, maxAttack, armor,speed, x, y);
    }

    public Monk(String name, int x, int y){
        super(name, 30, 30, -1, -4, 8, 5, x, y);
        super.name = name;
    }

    @Override
    public void step(ArrayList<Characters> team1, ArrayList<Characters> team2){
    }

    @Override
    public String getinfo(){
        return "Я Монах";
    }
}
