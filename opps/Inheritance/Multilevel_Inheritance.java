package opps.Inheritance;

// Parent class
class Person {
    String name;
    int age;
    String city;

    // Constructor
    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
}

// Child class
class Student extends Person {
    int roll_no;

    // Constructor calls parent constructor
    Student(String name, int age, String city, int roll_no) {
        super(name, age, city); // call Person's constructor
        this.roll_no = roll_no;
    }
}

// Grandchild class
class Ta_student extends Student {
    int salary;

    // Constructor calls Student constructor
    Ta_student(String name, int age, String city, int roll_no, int salary) {
        super(name, age, city, roll_no); // call Student's constructor
        this.salary = salary;
    }

    // Method to display info
    void getInfo() {
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("city : " + city);
        System.out.println("roll_no : " + roll_no);
        System.out.println("salary : " + salary);
    }
}

// Main class
public class Multilevel_Inheritance {
    public static void main(String[] args) {
        // Create object and set all values at once
        Ta_student t1 = new Ta_student("Rohit", 19, "Mumbai", 413, 25000);
        t1.getInfo();
    }
}
