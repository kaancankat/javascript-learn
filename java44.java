import java.util.Scanner;
public class tersucgen {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int number;
        System.out.print("Basamak sayısı: ");
        number = imput.nextInt();
        

        for (int d = number; 0 <= d; d--) {

            for (int b = 1; b<=number-d; b++)
            {
                System.out.print(" ");
            }
            for (int c = 1; c<=(2*d)-1; c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
