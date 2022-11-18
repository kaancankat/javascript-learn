import java.util.Scanner;
public class fibonaccibulma {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);

        int basamak;
        System.out.println("Eleman sayısı: ");
        basamak= imp.nextInt();

        int toplam=0;
        int n1=0,n2=1;

        for (int i =1; i<basamak ; i++){

            toplam=n1+n2;

            if(n1==0)
                System.out.print(n1);

            if(i==1)
                System.out.print("-"+i);
                System.out.print("-"+toplam);
                n1=n2;
                n2=toplam;
        }
    }
}