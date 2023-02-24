import java.util.ArrayList;
import java.util.Random;

public abstract class Characters implements Getinterface {
    protected String name;
    int hp;
    protected int maxHp;
    protected int minAttack;
    protected int maxAttack;
    protected int armor;
    protected int speed;
    public Vector2D pos;
    
    public Characters(String name, int hp,int maxHp, int minAttack, int maxAttack,int armor, int speed, int x, int y){
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.minAttack = minAttack;
        this.maxAttack = maxAttack;
        this.armor = armor;
        this.speed = speed;
        pos = new Vector2D(x,y);
    }

    public int getAttack(){
        return 0;
    }

    public int getHp() {
        return hp;
    }

    public int getSpeed(){
        return speed;
    }

    @Override
    public void step(ArrayList<Characters> tean1, ArrayList<Characters> tean2){
        Getinterface.super.step(tean1, tean2);
    }

    @Override
    public String getinfo(){
        return "Я человек";
    }

    @Override
    public String toString() {
        return String.format("%s %d %d",name,hp,speed);
    }

    public static String setName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length -1)]);
    }

    public static ClassesCharacters setClass(){
        return ClassesCharacters.values()[new Random().nextInt(ClassesCharacters.values().length- 1)];
    }

    public static void createArrayList(ArrayList<Characters> arrayList1, ClassesCharacters units, int a){
        switch(units){
            case Mag -> arrayList1.add(new Mag(setName(), a, 0));
            case Snaiper -> arrayList1.add(new Snaiper(setName(),a,0));
            case Fermer -> arrayList1.add(new Fermer(setName(),a,0));
            case Bandit -> arrayList1.add(new Bandit(setName(),a,0));
        }
    }

    public static void createArrayList2(ArrayList<Characters> arrayList2, ClassesCharacters units, int a){
        switch(units){
            case Monk -> arrayList2.add(new Monk(setName(),a,10));
            case Sperman -> arrayList2.add(new Spearman(setName(), a, 10));
            case Fermer -> arrayList2.add(new Fermer(setName(),a,10 ));
            case Crossbowman -> arrayList2.add(new Crossbowman(setName(),a,10));
        }
    }
    
    
} 

