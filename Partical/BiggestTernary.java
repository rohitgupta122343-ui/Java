
public class BiggestTernary  {
    public static void main(String[] args) {
        
        int a = 5;
        int b = 10;
        int c = 20;

        int max = (a>b ? (a>c?a:c):(b>c?b:c));

        System.out.println("Biggest Element "+max);
    }   
}
