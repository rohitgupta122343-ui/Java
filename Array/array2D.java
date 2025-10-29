package Array;


import java.util.Arrays;

public class array2D {
    public static void main(String[] args) {
        
        int[][] arr2D = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(Arrays.deepToString(arr2D));
   
        System.out.println("arr2D[0][0] : "+arr2D[0][0]);
        System.out.println("arr2D[2][2] : "+arr2D[2][2]);

        for (int i = 0; i < arr2D.length; i++) {

            for (int j = 0; j < arr2D.length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
        }
    }
}
