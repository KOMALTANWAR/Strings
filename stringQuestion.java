public class stringQuestion{
    //check that a string is palindrome or not 
    public static boolean isPalindrome(String str){
       int n=str.length();
       for(int i=0;i<n/2;i++){
        if(str.charAt(i)!=str.charAt(n-1-i)){
          return false;
        }

       }
       return true;
    }
    //Question:Given a route containing four directions(N,E,W,S) .Find the shortest path to
    // reach the destination "WNEENESENNN".
    public static int findShortestPath(String destination){
      int x=0;
      int y=0;
      int length=destination.length();
      for(int i=0;i<length;i++){
         if(destination.charAt(i)=='E'){
          x++;
         }
         else if(destination.charAt(i)=='W'){
          x--;
         }
         else if(destination.charAt(i)=='N'){
          y++;
         }else{
          y--;
         }
      }
      return (int)Math.sqrt(y*y+x*x);
    }
    public static void main(String args[]){
     System.out.println( isPalindrome("racecar"));
     System.out.println(findShortestPath("WNEENESENNN"));
    }
}