package java1.homework;
import java.util.Scanner;


public class HomeWork6 {
    public static void main(String[] args) {

        System.out.println("Введите дистанцию для бега, прыжка, плавания через пробел");

        Scanner scanner = new Scanner(System.in);
        int DistanceRun = scanner.nextInt();
        int DistanceJump = scanner.nextInt();
        int DistanceSwim = scanner.nextInt();


        Cat cat = new Cat();
        cat.jump(DistanceRun);
        cat.run (DistanceJump);
        cat.swim (DistanceSwim);

        Dog dog = new Dog();
        dog.jump(DistanceRun);
        dog.run (DistanceJump);
        dog.swim (DistanceSwim);
    }
}

abstract class Animal{

    abstract void jump(int lengthJump);

    abstract void run (int lenghtRun);

    abstract void swim (int lenghtSwim);
}

    class Cat extends Animal {
        private int MaxJump = 20;
        private int MaxRun = 200;
        private int MaxSwim = 0;

        @Override
        void jump(int lengthJump) {
            if ((lengthJump >= 0) && (lengthJump <= MaxJump))
                System.out.println("Кот смог запрыгнуть на препядствие");
            else
                System.out.println("Кот не допрыгнул :(");
        }

        @Override
        void run(int lenghtRun) {
            if ((lenghtRun >= 0) && (lenghtRun <= MaxRun))
                System.out.println("Кот пробежал");
            else
                System.out.println("Кот не смог пробежать");
        }

        @Override
        void swim(int lenghtSwim) {
            if ((lenghtSwim >= 0) && (lenghtSwim <= MaxSwim))
                System.out.println("Кот проплыл");
            else
                System.out.println("Коты не умеют плавать");
        }
    }
    class Dog extends Animal {
        private int MaxJump = 10;
        private int MaxRun = 500;
        private int MaxSwim = 10;

        @Override
        void jump(int lengthJump) {
            if ((lengthJump >= 0) && (lengthJump <= MaxJump))
                System.out.println("Собака смола запрыгнуть на препядствие");
            else
                System.out.println("Собака не допрыгнула :(");
        }

        @Override
        void run(int lenghtRun) {
            if ((lenghtRun >= 0) && (lenghtRun <= MaxRun))
                System.out.println("Собака пробежала");
            else
                System.out.println("Собака не смола пробежать");
        }

        @Override
        void swim(int lenghtSwim) {
            if ((lenghtSwim >= 0) && (lenghtSwim <= MaxSwim))
                System.out.println("Собака проплыла");
            else
                System.out.println("Собаки не умеют плавать");
        }
    }
