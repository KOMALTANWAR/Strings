import java.util.*;
public class stringBasics{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    //Creation of a string
    //Method 1
    String str=new String("komal");
    System.out.println(str);

    //Method 2:
    String name="RadhaRani";
    String student="ROHIT";
    System.out.println(name);

    //taking string as an input
    System.out.println("Kindly enter your input string ");
    String input_string=sc.nextLine();
    System.out.println(input_string);

    //.length() method of string class
    System.out.println(name.length());

    //String concetination
    System.out.println("Enter your first name");
    String first_name=sc.next();
    System.out.println("Enter your last name");
    String last_name=sc.next();
    String full_name="Welcome" +" "+ first_name+" "+last_name;
    System.out.println(full_name);

    //str_name.charAt(idx) method of string
    System.out.println(name.charAt(2));//return the character present at that index in the string

    //str_name.substring(si,ei) method
    System.out.println(name.substring(5,9));//returns thr part of string from starting index to ending index
  
   //str_name.toUpperCase() method;
   System.out.println(name.toUpperCase());

   //str_name.toLowerCase() method;
   System.out.println(student.toLowerCase());

   //str1.compareTo(str2) method --comapres the strings lexiographically
   String str1="apple";
   String str2="mango";
   int value=str1.compareTo(str2);
   if(value<0){
    System.out.println("string 1 is smaller than string 2");
   }else if(value>0){
     System.out.println("string 2 is smaller than string 1");
   }else{
    System.out.println("both the string are lexiographically equal");
   }


}
}