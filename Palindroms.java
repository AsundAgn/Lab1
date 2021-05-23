import java.util.Scanner;
public class Palindroms{

    public static String reverseString(String s){
        
        String r = "";
        for (int i = s.length() - 1; i >= 0; --i)
            r += s.charAt(i);
        return r;
        
        
    }

    public static boolean isPalindrome(String s){

        if (s.equals(reverseString(s))){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        String s=scan.next();
          
            if(isPalindrome(s)){
                System.out.println(" "+ s +" -YES");
            }else{
                System.out.println(" "+ s +" -NO");                }
            
        

    }

}