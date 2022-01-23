import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int total_length = A.length() + B.length();
        int isLexGreater = A.compareTo(B);
        A = Character.toUpperCase(A.charAt(0)) + A.substring(1);
        B = Character.toUpperCase(B.charAt(0)) + B.substring(1);
        System.out.println(total_length);
        System.out.println(isLexGreater > 0 ? "Yes" : "No");
        System.out.println(A + " " + B);
        
    }
}



