
public class GradeSwitch {
    public static void main(String[] args) {
        
        int marks = 85;

        switch (marks/10) {
            case 9:
                System.out.println("A+");
                break;
            case 8:
                System.out.println("A");    
                  break;
            case 7:
                System.out.println("B"); 
                  break;
            case 6:
                System.out.println("C");
                  break;          
        
            default:
            System.out.println("Fail");    
                break;
        }
    }
}
