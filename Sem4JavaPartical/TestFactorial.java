

import mypack.Factorial;
import java.util.Scanner;

class main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        long resulut = Factorial.findFactorial(num);

        System.out.print(resulut);
    }
}