import java.util.Scanner;
public class palindromsayi {

    static boolean ispalin (int sayi) {

        int gecicisayi = sayi;

            int yenisayi = 0;
        while (gecicisayi != 0) {
            int kalan = 0;
            kalan = gecicisayi % 10;

            yenisayi = (yenisayi * 10)+kalan;

            gecicisayi=gecicisayi/10;
        }

        if(sayi==yenisayi){
            System.out.println(yenisayi+" Palindrom sayıdır.");
            return true;
        }
        else {
            System.out.println(sayi+ " Palindrom sayı değildir.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        
        int birsayi;

        System.out.print("Bir sayı girin: ");
        birsayi = imput.nextInt();
        System.out.println(ispalin(birsayi));
    }
}
