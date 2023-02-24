import java.util.ArrayList;
import java.util.Random;

public class Snaiper extends Characters {
    
    int ammunition;//боезапас

    public Snaiper(String name, int hp, int maxHp, int minAttack, int maxAttack, int armor,int speed,int posX, int posY){
        super(name, hp, maxHp, minAttack, maxAttack, armor, speed, posX, posY);
        this.ammunition = 32;
}

    public Snaiper(String name,int x, int y){
        super(name,15,15,8,12,10,9,x,y);
        super.name = name;
    }

    boolean FermerSearch(ArrayList<Characters> t){
        boolean fermer = true;
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i) instanceof Fermer){
                fermer = false;
            }
        }
        return fermer;   
    }// Поиск фермера, задача 3.4

    @Override
    public void step(ArrayList<Characters> team1, ArrayList<Characters> team2){//Реализация заданий для семинара 3
        Random rnd = new Random();
        if(this.hp  == 0 || this.ammunition == 0){
            System.out.println("Конец хода");
        }else{
            if (team1.contains(this)){
                double min = Vector2D.Distance(this, (Characters) team2.get(0));//Назначаю первый индекс за минимум
                double tmp;
                int index = 0;
                for (int i = 0; i < team2.size(); i++) {
                    tmp = Vector2D.Distance(this, (Characters) team2.get(i));
                    if(min > tmp){
                        min = tmp;
                        index = i;
                    }// Дистанция до противника и его индекс
                }
                System.out.println(this.toString());
                System.out.println(team2.get(index));
                System.out.printf("%s атакует %s\n", this.name, team2.get(index).name);
                team2.get(index).hp -= rnd.nextInt(this.minAttack, this.maxAttack + 1);
                if(FermerSearch(team2)){
                    this.ammunition --;
                }
                System.out.println(this.toString());
                System.out.println(team2.get(index));
            }else{
                double min = Vector2D.Distance(this, (Characters) team1.get(0));//Назначаю первый индекс за минимум
                double tmp;
                int index = 0;
                for (int i = 0; i < team1.size(); i++) {
                    tmp = Vector2D.Distance(this, (Characters) team1.get(i));
                    if(min > tmp){
                        min = tmp;
                        index = i;
                    }
                }
                System.out.println(this.toString());
                System.out.println(team1.get(index));
                System.out.printf("%s атакует %s\n", this.name, team1.get(index).name);
                team1.get(index).hp -= rnd.nextInt(this.minAttack, this.maxAttack + 1);
                if(FermerSearch(team1)){
                    this.ammunition --;
                }
                System.out.println(this.toString());
                System.out.println(team1.get(index));
            }
        }
    }
    @Override
    public String getinfo(){
        return "Я Снайпер";
    }
}
