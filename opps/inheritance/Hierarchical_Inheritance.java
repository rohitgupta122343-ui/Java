package opps.inheritance;

class person{
    String name;
    int age;
    
}

class student extends person{

}

class teacher extends person{

}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        
        student s1 = new student();

        s1.name = "rohit";
        s1.age = 19;
         System.out.println(s1.name);
         System.out.println(s1.age);

         teacher t1 = new teacher();
         t1.name = "rahul";
        t1.age = 25;
         System.out.println(t1.name);
        System.out.println(t1.age);
    }
}
