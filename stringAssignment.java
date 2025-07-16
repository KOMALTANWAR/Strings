import java.util.*;
public class stringAssignment{
   // Question1:Count how many times lowercase vowels occurred in a String entered by the user
   public static int countLowerCaseVowel(String str){
    int n=str.length();
    int count=0;
    for(int i=0;i<n;i++){
        if(str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
            count++;
        }
    }
    return count;
   }
   //check if two strings are anagrams or not
   public static boolean checkAnagrams(String s1,String s2){
        if (s1.length() != s2.length()) return false;
        
        // Sort both strings
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        // Compare sorted strings
        return Arrays.equals(s1Array, s2Array);
    }
        
       public static void main(String args[]){
       System.out.println(countLowerCaseVowel("Hey ! how are you ?"));
       System.out.println(checkAnagrams("race","ecar"));
    }
}