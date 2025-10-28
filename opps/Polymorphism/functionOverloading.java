package opps.Polymorphism;

class Calculator {
 
    int add(int a, int b) {
        return a + b;
    }

   
    double add(double a, double b) {
        return a + b;
    }
}
public class functionOverloading {
 public static void main(String[] args) {

    Calculator c1 = new Calculator();
    System.out.println(c1.add(5, 05));
    System.out.println(c1.add(5.2,5.1));
 }
}
