package opps.Encapsulation;

class teacher{

    String name;
    int age;
   private int salary;
    String dept;

    teacher() {
        System.out.println("Constructor ");
    }

    public void setSalary(int s){
        this.salary = s;
    }

    public int getSalary(){
        return salary;
    }
}

class Encapsulation{
    public static void main(String[] args) {
        
        teacher t1 = new teacher();

        t1.name = "rohit";
        t1.age = 19;
        t1.dept = "it";
        t1.setSalary(25000);

        System.out.println("name " + t1.name);
        System.out.println("age "+t1.age);
        System.out.println("dep "+t1.dept);
        System.out.println("salary " + t1.getSalary());
    }
}