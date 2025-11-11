

public class BooleanExample {
    public static void main(String[] args) {

        boolean isJava_Fun = true;
        boolean isJava_Sad = false;

        System.out.println("is Java_Fun "+isJava_Fun);
        System.out.println("is Java_Sad "+isJava_Sad);

        // Using Boolean Expression
        int x = 10;
        int y = 5;

        System.out.println("X : "+x +" Y : " + y);
        System.out.println("X is Greater Than Y " + (x>y));
        System.out.println("X is Equal than Y " + (x==y));

        
        // Boolean logic

        System.out.println("(x>y) && isJava_Fun "+((x>y) && isJava_Fun));
}
}

