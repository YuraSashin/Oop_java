public class Monk extends Characters{
    int treatment;
    
    public Monk(String name, int hp, int maxHp, int minAttack, int maxAttack, int armor, int speed){
        super(name, hp, maxHp, minAttack, maxAttack, armor,speed);
    }

    public Monk(String name){
        super(name, 30, 30, -1, -4, 8, 5);
        super.name = name;
    }

    @Override
    public void step(){
        super.step();
    }

    @Override
    public String getinfo(){
        return "Я Монах";
    }
}
