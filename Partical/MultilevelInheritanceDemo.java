

class person{
    
    String name;

    person(String name){
        this.name = name;
    }
}

class emp extends person{

    int emp_id;
    
    emp(String name,int id){
        super(name);
        emp_id = id;
    }

    void show(){

        System.out.println("name "+ name);
        System.out.println("id "+emp_id);
    }
}

class manger extends emp{
    String dep;
    
    manger(String dep,String name,int id){
     
        super(name,id);
        this.dep = dep;
    }

    void showManger(){
        show();

        System.out.println("Department "+ dep);
    }

}



public class MultilevelInheritanceDemo {

    public static void main(String[] args) {
        manger m1 = new manger("it ", "rohit ", 101);

        System.out.println("Details");
        m1.showManger();
    }
    
}
