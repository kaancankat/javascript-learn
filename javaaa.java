import java.util.Scanner;

public class RecursiveExponentialNumbers {
    /**
     * @author: Ece Özaydın
     * @date: 4.11.2022
     * calculateExponential ; calculates the result according the entered value from user
     *
     * */
    static int sum=1;
    /*
     * Takes number and its exponential from user as an input.
     * Calculates result as a "sum"  and returns it.
     * */
    static int calculateExponential(int number,int exponent){
        if(exponent==0){
            return 1;
        }

        sum*=number;
        calculateExponential(number,exponent-1);
        return sum;

    }
    public static void main(String[] args){



        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();
        System.out.println("Enter the exponential of the number:");
        int power=input.nextInt();

        int result=calculateExponential(num,power);



        System.out.println("Result:  "+result);
    }
}