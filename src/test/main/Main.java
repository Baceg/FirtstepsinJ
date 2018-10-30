package test.main;

import test.util.Animal;
import test.util.animaltypes.Sucker;

public class Main {
    public static void main(String[] args) {

//        alt + insert -> gettery i settery itp przy tworzeniu klasy
//        ctrl + "/" -> wykomentować fragment zaznaczony
//        shift + f6 -> refactoring
//        ctrl+shift+f10 -> wykonanie metody main na której jest kursor
//        psvm -> skrót do main
//        sout -> skrót do System.out.println









        Greeter greeter = new Greeter();

        System.out.println("Hello world");
        greeter.sayHello("world");
//        do Animala dodaj kilka zmiennych i dołóż gettery i settery


        Plant plant = new Plant("dziwka");

//        System.out.println(Plant.counter);
        System.out.println(plant.getName());



        System.out.println("plant przed:  " + plant);
        plant.setName("mnich");
        System.out.println("plant po:  " + plant);

        System.out.println(5);
        System.out.println('4');
        System.out.println(4.23);


//        alt+enter --> import
        Animal animal = new Animal("tygrys", 27);

        Sucker sucker = new Sucker("dziobak", 13);

    }
}
