package numberFibonachi;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {

        //Через оператор for

//        int i0=0;
//        int i1 =1;
//        int i2;
//        int n=20;
//        System.out.print(i0 + " " + i1+ " ");
//
//         for(int a=0; a<n; a++){
//             i2=i0+i1;
//             System.out.print(i2+" ");
//             i0=i1;
//             i1=i2;
//
//         }

        //через массивы
        int [] arr = new int[10];
        arr [0] = 0;
        arr [1] = 1;
        System.out.print(arr[0] + " ");
        for (int i=2; i<arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.print(arr[i] + " ");
        }
    }
}
