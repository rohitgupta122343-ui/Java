
package Array;

import java.util.Arrays;

public class arrayOperation {

    public static void main(String[] args) {
        
        int[] marks = {78,79,81,82,84};

        System.out.println(Arrays.toString(marks));

    
        System.out.println("index 1 : " + marks[1]);
        System.out.println("index 3 : "+marks[3]);

      // iterate For loop
      for (int i = 0; i < marks.length; i++) {
        System.out.println("index " + i +  " " +  marks[i]);
      }
    }
}