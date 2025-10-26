package String;

public class string_Method {
    
    public static void main(String[] args){

        String name = "Rohit";

        // String Method
        // 1. charAt()
        // 2. isEmpty()
        // 3. toLowerCase()
        // 4. toUpperCase()
        // 5. trim()
        // 6. length

        System.out.println("name : " + name);

        // 1. charAt()

        System.out.println("charAt() : " + name.charAt(0));

        // 2. isEmpty()

        System.out.println("isEmpty() : " +  name.isEmpty());

        // 3. toLowerCase()

        System.out.println("toLowerCase() : " + name.toLowerCase());

        // 4. toUpperCase()
        
        System.out.println("toUpperCase() : "+  name.toUpperCase());

        // 5. length

        System.out.println("length() : " + name.length());

        // 6. trim()

        String city = "mumbai ";

        System.out.println("trim() : " + city.trim());


    }
}
