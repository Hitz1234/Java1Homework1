package java1.homework;

public class HomeWorkApp {
    public static void main(String[] args){
        printThreeWorld();
        checkSumSign();
        pringColor();
        compareNumber();
    }
    public static void printThreeWorld(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        int a = 10;
        int b = 4;

        if (a+b>0) {
            System.out.println("Сумма положительная");
            }
        else if (a+b<0){
            System.out.println("Сумма отрицательная");
            }
    }
    public static void pringColor(){
        int value= 101;

        if (value<=0) {
            System.out.println("Красный");
        }
        else if (value>0 && value<=100){
            System.out.println("Желтый");
        }
        else if (value>100){
            System.out.println("Зеленый");
        }
    }
    public static void compareNumber(){
        int a = -10;
        int b = 8;

        if (a>=b){
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
}
