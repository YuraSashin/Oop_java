public class Bandit extends Characters {
    public Bandit(String name, int hp, int attack, int speed){
        super(name, hp, attack, speed);
}

public Bandit(String name){
    super(name, 100, 1, 15);
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
