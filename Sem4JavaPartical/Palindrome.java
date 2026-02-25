

import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string");
        String str = sc.nextLine();

        String revString = "";

        for(int i = str.length()-1; i>=0; i--){
            revString += str.charAt(i);
        }

        if(str.equals(revString)){
            System.out.print("hai Palindrome");
        }
        else{
            System.out.print("Nhi hai Palindrome");
        }

    }
}
