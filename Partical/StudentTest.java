
class Student{

    String name;
    int age;

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    void show(){
        System.out.println("name "+name);
        System.out.println("age "+age);
    }

}


public class StudentTest {
    
    public static void main(String[] args) {

        Student s1 = new Student("rohit",19);

        s1.show();
        
    }
}
