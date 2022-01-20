import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    /*
        More about hasNext() -> https://www.javatpoint.com/post/java-scanner-hasnext-method 
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        // The hasNext() is a method of Java Scanner class which returns true if this scanner has another token in its input.
        while(in.hasNext()){ 
            String line = in.nextLine();
            System.out.println(++count + " " + line);
        }
    }
}