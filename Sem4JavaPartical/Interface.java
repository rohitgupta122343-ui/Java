
interface  printable{
    void print();
}

interface showable{
    void show();
}

class demo implements printable,showable {
    
    public void print(){
        System.out.print("hello java");
    }

    public void show(){
        System.out.print("Showable interface ");
    }
}

public class Interface{
    public static void main(String[] args) {
        demo d1 = new demo();

        d1.show();
        d1.print();
    }
}