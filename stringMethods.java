
import java.util.Arrays;

public class stringMethods {

    public static void main(String[] args) {
        String name = "Karthik";
        //length
        System.out.println(name.length());
        //chat at
        System.out.println(name.charAt(1));
        //sub string 
        System.out.println(name.substring(2, 6));
        //contains
        System.out.println(name.contains("a"));
        //equals
        System.out.println(name.equals("Karthik") + "  dja");
        //equalIgnorecase
        System.out.println(name.equalsIgnoreCase("KArThiK") + "   no case");
        //uppercase
        System.out.println("hello".toUpperCase());  
        //lowerrcase
        System.out.println("HELLO".toLowerCase());  
        //trim
        System.out.println("   Kar  ".trim().length());
        //replace
        System.out.println(name.replace("k", " "));
        //split
        String [] parts ="k,a,r,t,h,i,k".split(",");
        System.out.println(Arrays.toString(parts));
        //join
        String  join =String.join("-", "2023","06","18");
        System.out.println(join+"   ll");
    }
}
