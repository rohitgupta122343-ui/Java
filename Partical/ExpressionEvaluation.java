
class ExpressionEvaluation{
    public static void main(String[] args) {
        
        int a = 10; 
        int b = 5;
        int c = 8;
        int d = 2;

        int result = a + b * c % d;
        
        System.out.println("Values: a=" + a + ", b=" + b + ", c=" + c + ", d=" + d);
        System.out.println("Result: " + result);
    }
}