package ArrayChar;

public class Charss {
    public static void main(String[] args) {
        char [][] arrays = new char[][]{
                {'a', 'b'},
                {'d', 'e'},
                {'i', 'g'},
                {'h', 'j'}
        };
        for(char[] stroka : arrays){
            for( char elemets : stroka){
                System.out.print(elemets + " ");

            }
            System.out.println();
            System.out.println(arrays[1].length); // узнать можно длину массива или строки
        }
    }

}
