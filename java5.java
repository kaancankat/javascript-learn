package DonguOdevler;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Perfect Number Program");
        int number, total =0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        for (int i = 1; i<number; i++){
            if (number%i==0){
                total += i;
            }
        }
        if (total == number){
            System.out.println(+number+" is a perfect number.");
        }else {
            System.out.println(+number+" is NOT a perfect number.");
        }
    }
}

