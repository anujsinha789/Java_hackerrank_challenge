import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder input = new StringBuilder();
 
        // append a string into StringBuilder input
        input.append(A);
 
        // reverse StringBuilder input1
        input.reverse();
        System.out.println(input.toString().compareTo(A) ==0 ? "Yes" : "No");
        
    }
}

// Read this : https://www.javatpoint.com/string-comparison-in-java

