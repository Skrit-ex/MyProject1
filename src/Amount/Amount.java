package Amount;
import java.util.Scanner;

public class Amount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Веведите долг: ");
        int amount = scanner.nextInt();


        for( int x=1, i=1; x<=3; x++,i++ ){


           amount=amount-(amount*10/100);
           if (i==3){
               System.out.println("Оставшийся долг за " +x+ " месяц ");
               System.out.println(amount);
           }


        }
        }
    }
