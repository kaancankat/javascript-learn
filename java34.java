import java.util.Scanner;
public class asalsayılar {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int n1=2,n2=1;
        int toplam=0;

        while (!(n1<n2)) {
            System.out.print("Küçük sayı: ");
            n1 = imput.nextInt();
            System.out.print("Büyük Sayı: ");
            n2 = imput.nextInt();
            if (n1>=n2){
                System.out.println("İlk sayı, ikinci sayıdan küçük olmak zorunda. Tekrar deneyin.");
            }
            System.out.println("--------------------------------");
        }
        for (int i = n1; i<=n2; i++){

            for (int k = 1; k<=i; k++){

                if(i%k==0){
                    toplam=toplam+k;
                }
            }
            if (toplam==i+1){
                System.out.print(i+" ");
            }
            toplam=0;
        }
    }
}
