package Lesson3ExersizeArrays;

import java.net.SocketOption;

public class Exercise {
    public static void main(String[] args) {
//        char symbol = 'a';
//        String [][] arrays = new String [4][6];
//        for(int i=0; i< arrays.length; i++) {         //i<arrays.length делает масив универсальным для вводимых данных [][];
//            for (int j = 0; j< arrays[0].length; j++) {   //для двумерного массива arrays[0].length
//                arrays[i][j] = symbol + "" + j;
//                System.out.print(arrays[i][j] + " ");
//            }
//            symbol++;
//            System.out.println();
//
//        }
//    }
//}

//Пример массива "пирамиды"

        int[][] array = new int[4][];
        array[0] = new int[1];
        array[1] = new int[2];    //выделяем память под массив
        array[2] = new int[3];
        array[3] = new int[4];
        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j< i + 1; j++) {     //альтернативно можно написать array.length
                array[i][j] = k;
                k++;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}