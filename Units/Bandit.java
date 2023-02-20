public class Bandit extends Characters {
    public Bandit(String name, int hp, int maxHp, int minAttack, int maxAttack, int armor, int speed){
        super(name, hp, maxHp, minAttack, maxAttack, armor, speed);
}

public Bandit(String name){
    super(name, 10, 10, 2, 4,3, 6);
    super.name = name;
}

@Override
public void step(){
    super.step();
}

@Override
public String getinfo(){
    return "Я Разбойник";
}
}
