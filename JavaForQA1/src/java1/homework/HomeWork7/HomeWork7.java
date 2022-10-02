package java1.homework.HomeWork7;
import java.util.Scanner;

public class HomeWork7 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int action;
        Cat[] cats = new Cat[3];
        cats[0]  = new Cat ("Барсик", 10, false);
        cats[1]  = new Cat ("Мурзик", 5, false);
        cats[2]  = new Cat ("Пушок", 3, false);



       Plate plate = new Plate(6);
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].fullness == false && cats[i].appetite < plate.foodAmount){
                cats[i].eat(plate);
                cats[i].fullness = true;
                System.out.println("Котик " + cats[i].name + " покушал!");
            }
            else {
                System.out.println("Котик " + cats[i].name + " не поел!");
            }
        }

        plate.info();
        System.out.println("Сколько корма добавить?");
        action = scanner.nextInt();
        plate.addFood(action);
        plate.info();

    }
}