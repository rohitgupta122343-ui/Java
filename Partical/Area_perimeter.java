

class circle {

    double r;

    void setRadius(double radius){
        r = radius;
    }

    double area(){
        return Math.PI * r * r;
    }

    double perimeter(){
        return 2 * Math.PI * r;
    }
    
}


class Area_perimeter{
    
    public static void main(String[] args) {

        circle c1 = new circle();

        c1.setRadius(5);
        
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
    }
}