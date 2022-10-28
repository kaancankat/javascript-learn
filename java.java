package javass;
import java.util.Scanner;
public class harmoniksayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:     ");
        int n;
        n = input.nextInt();
        double toplam = 0.0;
        for(int i = 1; i <= n; i++){
            toplam += (1.0/i);}
        System.out.print(n + " Sayısının Harmonik Serisi:     " + toplam);}}

        