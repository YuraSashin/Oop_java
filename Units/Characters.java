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

    public Characters(String name, int hp,int maxHp, int minAttack, int maxAttack,int armor, int speed){
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.minAttack = minAttack;
        this.maxAttack = maxAttack;
        this.armor = armor;
        this.speed = speed;
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
    public void step(){

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

    public static void createArrayList(ArrayList<Characters> arrayList1, ClassesCharacters units){
        switch(units){
            case Mag -> arrayList1.add(new Mag(setName()));
            case Snaiper -> arrayList1.add(new Snaiper(setName()));
            case Fermer -> arrayList1.add(new Fermer(setName()));
            case Bandit -> arrayList1.add(new Bandit(setName()));
        }
    }

    public static void createArrayList2(ArrayList<Characters> arrayList2, ClassesCharacters units){
        switch(units){
            case Monk -> arrayList2.add(new Monk(setName()));
            case Sperman -> arrayList2.add(new Spearman(setName()));
            case Fermer -> arrayList2.add(new Fermer(setName()));
            case Crossbowman -> arrayList2.add(new Crossbowman(setName()));
        }
    }
    
    
} 

