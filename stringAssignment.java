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
    public static void main(String args[]){
       System.out.println(countLowerCaseVowel("Hey ! how are you ?"));
    }
}