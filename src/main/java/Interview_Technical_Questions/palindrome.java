package Interview_Technical_Questions;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

      isPalindrome("ali");
    }
    public static boolean isPalindrome(String str){
        if(str == null)
            return false;
        StringBuilder sb= new StringBuilder();
        return sb.reverse().toString().equals(str);


    }


}
