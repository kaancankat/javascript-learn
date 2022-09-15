import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    double r, alfa, pi=3.14,alan;
        Scanner input = new Scanner(System.in);
        System.out.print("dairenin yaricapini yaziniz: ");
        r = input.nextDouble();
        System.out.print("daire diliminin acisini yaziniz: ");
        alfa = input.nextDouble();
        alan = (pi*Math.pow(r,2)*alfa)/360;
        System.out.println("daire diliminin alani: "+alan);
    }
}