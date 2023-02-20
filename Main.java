import java.util.ArrayList;
import java.util.Comparator;

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
public class Main {
    public static void main(String[] args) {

        ArrayList<Characters> arrayList1 = new ArrayList<>();
        ArrayList<Characters>arrayOll = new ArrayList<>();

        System.out.println("Команда 1");
        while(arrayList1.size()< 10){
            Characters.createArrayList(arrayList1, Characters.setClass());
        }

        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println( arrayList1.get(i).getinfo());
            arrayOll.add(arrayList1.get(i));
        }

        ArrayList<Characters> arrayList2 = new ArrayList<>();

        while(arrayList2.size()< 10){
            Characters.createArrayList2(arrayList2, Characters.setClass());
        }

        System.out.println("Команда 2");
        for (int i = 0; i < arrayList2.size(); i++) {
            System.out.println(arrayList2.get(i).getinfo());
            arrayOll.add(arrayList2.get(i));
        }

        System.out.println(arrayOll);
        arrayOll.sort(new Comparator<Characters>() {
            public int compare(Characters o1, Characters o2){
                return o2.getSpeed() - o1.getSpeed();
            }
        });
        System.out.println(arrayOll);
    }  
}    



