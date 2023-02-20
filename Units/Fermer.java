public class Fermer extends Characters {
    
    int delivery;// доставка


    public Fermer(String name, int hp, int maxHp, int minAttack, int maxAttack, int armor, int speed){
        super(name, hp, maxHp, minAttack, maxAttack,armor, speed);
    }

    public int getcarttriges(){
        return 0;
    }

    public Fermer(String name){
        super(name, 1, 1, 1,1,1, 3);
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
