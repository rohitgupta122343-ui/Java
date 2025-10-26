package opps.ClassAndObject;



class teacher{

    String name;
    int age;
    int salary;
    String dept;

    teacher(){
        System.out.println("Im non parameter Contructor");
    }
}

public class ClassObjectExample {

    public static void main(String[] args) {
        
        teacher t1 = new teacher();

        t1.name = "rohit";
        t1.age = 19;
        t1.salary = 25000;
        t1.dept = "it";

        System.out.println("name : "+t1.name);
        System.out.println("age : "+t1.age);
        System.out.println("salary : "+t1.salary);
        System.out.println("dept : "+t1.dept);
    }
}