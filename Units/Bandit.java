import java.util.ArrayList;

public class Bandit extends Characters{
    public Bandit(String name, int hp, int maxHp, int minAttack, int maxAttack, int armor, int speed, int x, int y){
        super(name, hp, maxHp, minAttack, maxAttack, armor, speed, x, y);
}

public Bandit(String name, int x, int y){
    super(name, 10, 10, 2, 4,3, 6, x, y);
    super.name = name;
}

@Override
public void step(ArrayList<Characters> team1, ArrayList<Characters> team2){
    if(state.equals("Die")) return;
    int index = ClosestEnemy(team2);
    if(index < 2){
        int damage;
        if(team2.get(index).armor - maxAttack > 0){
            damage = maxAttack;
        }else{
            damage = minAttack;
        }
    team2.get(index).GetDamage(damage);
    return;
    }else{
        if (pos.getDown(team2.get(index).pos) & (pos.y != team2.get(index).pos.y)){
            pos.y++;
            return;
        }else if(!pos.getDown(team2.get(index).pos) & (pos.y != team2.get(index).pos.y)){
            pos.y--;
            return;
        }
        if(pos.getLeft(team2.get(index).pos)){
            pos.x ++;
            return;
        }else{
            pos.x --;
            return;
        }
    }
}

@Override
public String getinfo(){
    return "Я Разбойник";
}
}
