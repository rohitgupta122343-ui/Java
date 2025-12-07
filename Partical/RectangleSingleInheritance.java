
class shape{

    double length;
    double width;

    shape(double l, double w){
        length = l;
        width = w;
    }
}

public class RectangleSingleInheritance extends shape {
    
 RectangleSingleInheritance(double l,double w){
    super(l,w);
 }

 double area(){
    return length * width;
 }

 public static void main(String[] args) {
    double l = 1;
    double w = 5;

   RectangleSingleInheritance r = new RectangleSingleInheritance(l,w);

  System.out.println(r.area());
 }
    

}
