import java.util.Scanner;

public class SinifGecmeDurum {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz : ");
        mat = input.nextInt();

        System.out.println("Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();

        System.out.println("Türkçe Notunuzu Giriniz : ");
        turkce = input.nextInt();

        System.out.println("Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();

        System.out.println("Müzik Notunuzu Giriniz : ");
        muzik = input.nextInt();

        double ortalama = ((mat + fizik + turkce + kimya + muzik) / 5);
        if (((0 > mat)||(0 > fizik)||(0 > turkce)||(0 > kimya)||(0 > muzik) ||
                (100 < mat)||(100 < fizik)||(100 < turkce)||(101 < kimya)||(100 < muzik)) ){
            System.out.println("Yanlış notlandırma yaptınız lütfen tekrar deneyin");
        } else if (ortalama<55) {
            System.out.println("Kaldınız : "+ortalama);
        }
        else {
            System.out.println("Geçtiniz : "+ortalama);
        }
    }
}


