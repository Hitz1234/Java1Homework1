package java1.homework;

public class HomeWork2 {
    static int x = 5;
    static int y = 5;
    static int z= -90;
    static int p= 2;
    static int year = 2000;

    public static void main(String[] args){
    System.out.println(step1(x,y));
    System.out.println(step2(z));
    System.out.println(step3(z));
    step4(p);
    System.out.println(step5(year));
    }

    private static boolean step1(int a, int b) {
        if (a+b >= 10 && a+b <= 20){
        return true;
        }
        else {
        return false;
        }
    }

    private static String step2(int a){
        if (a >= 0){
            return ("Положительное");
        }
        else {
            return ("Отрицательное");
        }
    }

    private static boolean step3(int a){
        if (a >= 0){
            return true;
        }
        else {
            return false;
        }
    }

    private static void step4(int i){
        for (i = 0; i< p; i++){
            System.out.println("Строка");
        }
    }
    private static boolean step5(int year){
        if ((year % 4 ==0) && (year % 100 != 0) || (year % 400 == 0)){
            return true;
        }
        else {
            return false;
        }
    }
}
