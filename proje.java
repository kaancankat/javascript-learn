import java.util.Scanner;
public class Burclar {
    public static void main(String[] args) {
        int month, day;
        String burc ="";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Dogdugunuz ay : ");
        month = input.nextInt();
        System.out.print("Dogdugunuz gun : ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day <22) {
                        burc = "Oglak";
                    }else{
                      burc = "Kova";
                    }
                } else{
                    isError = true;
                }
                break;
            case 2:
                if (day >= 1 && day <=28) {
                    if (day < 20) {
                        burc = "kova";
                    } else {
                        burc = "balik";

                    }

                }else {
                    isError = true;
                }
                break;
            case 3:
                if (day >= 1 && day <= 31) {
                    if (day <20) {
                        burc = "balik";
                    }else{
                        burc = "koc";
                    }
                } else{
                    isError = true;
                }
                break;

            case 4:
                if (day >= 1 && day <= 30) {
                    if (day <22) {
                        burc = "boga";
                    }else{
                        burc = "ikizler";
                    }
                } else{
                    isError = true;
                }
                break;
            default:
                isError = true;
        }
        if (isError){
            System.out.println("Hatali giris");
        }else {
            System.out.println("Burcunuz : " + burc);
        }

    }
}
