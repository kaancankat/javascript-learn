import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double kenar1, kenar2, hipotenus;
        Scanner input = new Scanner(System.in);
        System.out.println("kenar uzunluklarini giriniz ");
        kenar1 = input.nextInt();
        kenar2 = input.nextInt();
        hipotenus = Math.pow(kenar1,2)+Math.pow(kenar2,2);
        System.out.println("hipotenusun uzunlugu: "+ Math.sqrt(hipotenus));
    }
}