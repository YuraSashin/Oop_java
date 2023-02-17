public class Snaiper extends Characters {
    
int accurasy;
int ammunition;
int disquise;

    public Snaiper(String name, int hp, int attack, int speed){
        super(name, hp, attack, speed);
}

    public Snaiper(String name){
        super(name,50,50,10);
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
