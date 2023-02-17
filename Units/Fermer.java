public class Fermer extends Characters {
    
    int feed;
    int cartriges;

    public Fermer(String name, int hp, int attack, int speed){
        super(name, hp, attack, speed);
    }

    public int getcarttriges(){
        return 0;
    }

    public Fermer(String name){
        super(name, 100, 1, 20);
        super.name = name;
    }

    @Override
    public void step(){
        super.step();
    }

    @Override
    public String getinfo(){
        return "Я Крестьянин";
    }
}
