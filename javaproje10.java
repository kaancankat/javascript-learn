import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, total = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak olan sayıyı giriniz : ");
        a = input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz : ");
        b = input.nextInt();

        for (int i = 1; i <= b; i++){
            total *= a;
        }
        System.out.println("Sonuç => " + total);
    }
}