public class Snaiper extends Characters {
    
int ammunition;//боезапас

    public Snaiper(String name, int hp, int maxHp, int minAttack, int maxAttack, int armor,int speed){
        super(name, hp, maxHp, minAttack, maxAttack,armor, speed);
}

    public Snaiper(String name){
        super(name,15,15,8,12,10,9);
        super.name = name;
    }

    @Override
    public void step(){
        super.step();
    }

    @Override
    public String getinfo(){
        return "Я Снайпер";
    }
}
