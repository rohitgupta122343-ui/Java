
package MiniProject;

import java.util.Scanner;

public class guessTheGame {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = (int)(Math.random()*100);
        int userNumber;

        do {

            System.out.println("enter a number (1-100)");
            userNumber = sc.nextInt();

            if (userNumber == n) {
                System.out.println("wow Nice Guees");
                break;
            }
            else if (userNumber > n ) {
                System.out.println("Your Number Is Bigger");
            }
            else{
                System.out.println("Your Number is Smaller");
            }
            
        } while (userNumber > 0);
        System.out.println("End");

    }
}
