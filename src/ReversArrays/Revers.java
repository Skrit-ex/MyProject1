package ReversArrays;
import java.util.Arrays;

public class Revers {
    public static void main(String[] args) {

        int [] arr1 = new int[]{};
        System.out.print(Arrays.toString(arr1) + "  Invert => ");
        Invert.inver(arr1);
        System.out.println(Arrays.toString(arr1));

        int [] arr2 = new int[]{1,2,3};
        System.out.print(Arrays.toString(arr2)+ "  Invert => ");
        Invert.inver(arr2);
        System.out.println(Arrays.toString(arr2));

        int [] arr3 = new int[]{1,2,3,4,5};
        System.out.print(Arrays.toString(arr3)+ "  Invert => ");
        Invert.inver(arr3);
        System.out.println(Arrays.toString(arr3));

        int [] arr4 = new int[]{1,2,3,4,5,6,7,8};
        System.out.print(Arrays.toString(arr4)+ "  Invert => ");;
        Invert.inver(arr4);
        System.out.println(Arrays.toString(arr4));


    }
}
