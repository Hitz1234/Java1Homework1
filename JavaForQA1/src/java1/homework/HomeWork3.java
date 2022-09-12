package java1.homework;

public class HomeWork3 {
    public static void main(String[] args){
    step1();
    System.out.println("------------------------------------------------");
    step2();
    System.out.println("------------------------------------------------");
    step3();
    System.out.println("------------------------------------------------");
    step4();
    System.out.println("------------------------------------------------");
    step5(3,4);
    }
    public static void step1(){
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array1.length; i++) {
        if (array1[i]==1) {
            array1[i] = 0;
            }
        else {
            array1[i]=1;
        }
        System.out.println(array1[i]);
        }
    }
    public static void step2(){
        int[] array2 = new int [100];
        for (int i=1; i < array2.length; i++){
            array2[i] = i;
            System.out.println(array2[i]);
        }
    }
    public static void step3(){
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6){
                array3[i] = array3[i] * 2;
            }
            System.out.println(array3[i]);
        }
    }
    public static void step4(){
        int [][] array4 = new int [4][4];
        for (int i = 0; i < 4; i++) {
            array4[i][i] = 1;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){
                System.out.print(array4[i][j] + " ");
            }
                System.out.println();
        }
    }

    public static int [] step5(int len, int initialValue){
        int [] array5= new int[len];
        for (int i = 0; i<array5.length; i++){
            array5[i]=initialValue;
            System.out.print(array5[i] + " ");
        }
        return array5;
    }
}
