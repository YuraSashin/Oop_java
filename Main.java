import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Random;

// Крестьянин, разбойник, снайпер, колдун, копейщик, арбалетчик, монах. Для каждого сформировать список свойств и возможных действий. 
// Напрнимер свойство скорость, действие нанести удар. Проанализировать получившиеся свойства и действия персонажей и создать Обобщённый класс 
// описывающий свойства и действия имеющиеся у всех персонажей. Создать этот класс. Создать классы для каждого типа персонажей наследующие и расширяющие
//  абстрактный(обобщённый) класс. В основной программе создать по одному экземпляру каждого типа персонажей. Семинар1 

// Доработать дерево классов так, чтобы экземпляры классов создавались конструктором с именем в параметре а остальные параметры инициализировали сами 
// в зависимости от персонажа. Добавить файл интерфейса в котором описать два метода, void step(); и String getInfo(); Добавить реализацию интерфейса 
// в ваш коренной абстрактный класс. Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер" и так далее в зависимости от 
// типа персонажа. В основном классе создать список и добавить в него 10 случаных персонажей. Пройти по списку и вывести строку возвращаемую getInfo.
// Семинар 2

// В материалы добавил xml с полями и параметрами по умолчанию. Убедиться что у вас все поля описанны. Создать в основной программе два списка. 
// Положить в них по 10 случайных персонажей. В первом только крестьянин, разбойник, снайпер или колдун. Во втором крестьянин, копейщик, арбалетчик,
//  монах. Вывести в консоль информацию обо всех персонажах не зависимо от списка, очередь должна определяться скоростью каждого персонажа.
// Семинар 3 

// Создать класс с описанием координат, x и y.
// Добавить в абстрактный класс порле с координатами и пробросить его инициализацию до конструкторов персонажей. Farmer farmer = new Farmer(getName(), x, y);
// Реализовать метод step() лучников. 
// 3.1 Если жизнь равна нулю или стрел нет, завершить оьработку.
// 3.2 Поиск среди противников наиболее приближённого. 
// 3.3 Нанести среднее повреждение найденному противнику. 
// 3.4 Найти среди своих крестьянина. 
// 3.5 Если найден завершить метод иначе уменьшить запас стрел на одну.
//Семинар4

// Пример реализации шага лучника в архиве. Доработать шаг лучника в своём проекте. Сделать степ крестьян - если не труп то state = "Stand"
// если не труп то найти среди своих персонажа с здоровьем меньше максимального и вылечить его!
//Семинар5

//В приложении архив с проектом. Можно использовать его в своём проекте. Реализовать вывод псевдографики. Доработать степы магов лучников и крестьян.
// Семинар6

public class Main {
    public static ArrayList<Characters> allTeam = new ArrayList<>();
    public static ArrayList<Characters> holyTeam = new ArrayList<>();
    public static ArrayList<Characters> darkTeam = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Команда 1");
        Characters.createArrayList(allTeam, 0, 1);
        //System.out.println(allTeam);

        System.out.println("Команда 2");
        Characters.createArrayList(holyTeam, 0, 1);
        //System.out.println(holyTeam);

        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);
        sortTeam(allTeam);
        //System.out.println(allTeam);
        
        Scanner user_input = new Scanner(System.in);
        while (true){
            View.view();
            user_input.nextLine();
            for (Characters human: allTeam) {
                if (holyTeam.contains(human)) human.step(holyTeam, darkTeam);
                else human.step(darkTeam, holyTeam);
            }
        }
    }
 
    static void sortTeam (ArrayList<Characters> team){
        team.sort(new Comparator<Characters>() {
            @Override
            public int compare(Characters t0, Characters t1) {
                if (t1.getSpeed() == t0.getSpeed()) return (int) (t1.getHp() - t0.getHp());
                else  return (int) (t1.getSpeed() - t0.getSpeed());
            }
        });
    }
    static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }
}
