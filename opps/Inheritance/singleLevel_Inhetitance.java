

package opps.inheritance;

class person{

    String name;
    int age;
    String city;

}

class student extends person{

    int roll_no;

    student(String name,int age,String city,int roll_no){
        this.name = name;
        this.age = age;
        this.city = city;
        this.roll_no = roll_no;
    }

    void get_info(){
        System.out.println("name "+name);
        System.out.println("age "+age);
        System.out.println("city "+city);
        System.out.println("roll_no "+roll_no);
    }

}

public class singleLevel_Inhetitance {

    public static void main(String[] args) {

        student s1 = new student("rohit",19,"mumbai",413);

        s1.get_info();
        
    }
}