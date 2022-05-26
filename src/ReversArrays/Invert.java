package ReversArrays;

public class Invert {
    public static void inver(int[] array){
        for(int i = 0; i< array.length/2; i++){
            int tmp = array[i];
            array[i] = array[array.length -i -1];
            array[array.length-i-1] = tmp;
        }
    }
}
