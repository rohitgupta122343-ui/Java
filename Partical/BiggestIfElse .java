
class BiggestIfElse{
    public static void main(String[] args) {
        
        int a = 10; 
        int b = 20; 
        int c = 5;

        if(a>b && a>c){
            System.out.println("Biggest Element "+a);
        }
        else if(b>a && b>c){
            System.out.println("Biggest Element "+b);
        }
        else{
            System.out.println("Biggest Element "+c);
        }
    }
}