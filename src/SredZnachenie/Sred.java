package SredZnachenie;

import java.util.Scanner;

public class Sred {
    public static void main(String[] args) {
//        int [] array = {5, 6, 9, 10, 11};
//        int result = 0;
//
//        for(int d : array){
//            result += d;
//
//        }
//        System.out.println("Среднее значение переменных массива : "+ result/array.length);int
        Scanner num = new Scanner(System.in);
//        System.out.println("введите размер одномерного масива");
//        int k = num.nextInt();
        int k=0;
        System.out.println("введите элементы одномерного масива");
        int i = num.nextInt();
        int [] arrays = new int [i];
       // System.out.println("введите данные масива");
        for(int a=0; a<i; a++) {
            System.out.print(arrays[i] + k+ "\t");
            k++;
        }
        System.out.println(" ");
    }
}
