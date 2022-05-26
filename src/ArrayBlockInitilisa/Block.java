package ArrayBlockInitilisa;

import java.sql.SQLOutput;

public class Block {
    public static void main(String[] args) {
        int [][] array = {
                {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11}
        };
        for ( int[] arrayOne : array) {   //сначала перебираем строки
            for(int element : arrayOne){  // перебираем перебираем элементы одномерного массива каждой строки
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
