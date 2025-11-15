import Person.Actor;
import Person.Director;
import Show.*;

public class Theatre {
    public static void main(String[] args) {

        //Содаем трех актеров

        Actor actor1 = new Actor("Константин", "Хабенский", 172.00);
        Actor actor2 = new Actor("Анна", "Нетребко", 171.53);
        Actor actor3 = new Actor("Сергей", "Полунин", 180.35);

        //Создаем двух режисеров
        Director director1 = new Director("Алексей", "Степанюк", 70);
        Director director2 = new Director("Махар", "Вазиев", 60);

        //Создаем три спектакля, автора музыки и хореографа
        System.out.println();
        Show classicshow = new Classic("Три сестры",55, director1);
        MusicalShow ballet = new Ballet("Спартак", 130, director2, "Валерий Гергиев", "Борис Эйфман", "Либретто");
        MusicalShow opera = new Opera("Евгений Онегин", 180, director1, "Валерий Гергиев", 16, "Либретто");

        //Распределить актёров по спектаклям
        classicshow.addActor(actor1);
        ballet.addActor(actor1);
        ballet.addActor(actor3);
        opera.addActor(actor2);

        //Информация о спектаклях
        System.out.println(classicshow.toString());
        System.out.println("Cписок актеров: ");
        classicshow.printAllActors();

        System.out.println();
        System.out.println(ballet.toString());
        System.out.println("Cписок актеров: ");
        ballet.printAllActors();

        System.out.println();
        System.out.println(opera.toString());
        System.out.println("Cписок актеров: ");
        opera.printAllActors();

        System.out.println("\nИзменение списка акторов балета");

        // Замена актера
        ballet.changeActor(actor2, "Хабенский");
        //System.out.println(ballet.toString());
        System.out.println("Cписок актеров: ");
        ballet.printAllActors();

        // Замена несуществующего актера
        System.out.println("\nЗамена не существующего актера в классическом спектакле на Безрукова ");
        classicshow.changeActor(actor1, "Безруков");

        // Вывод текста либретто
        System.out.println("\nТекст либретто для балета");
        ballet.prinLibretto();
        System.out.println("\nТекст либретто для оперы");
        opera.prinLibretto();

    }
}
