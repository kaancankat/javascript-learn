import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
        System.out.println("Dizinin eleman sayısını giriniz");
        int elemanboyu= scan.nextInt();
        System.out.println("Dizinin elemanlarını giriniz");
        int[] elemanlar=new int[elemanboyu];
        for ( int i=0; i<elemanlar.length; i++){
            elemanlar[i]= scan.nextInt();
        }

        Arrays.sort(elemanlar);
        System.out.println(Arrays.toString(elemanlar));

   }

}