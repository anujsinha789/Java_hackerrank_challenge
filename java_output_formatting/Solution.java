import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d\n", s1, x);
                /* 
                - -> left indentation,
                15s -> feild size of string
                '0' -> adds zero in the front of the int,
                '3d' -> feild size of int
                '\n' -> new line char
                */
            }
            System.out.println("================================");

    }
}



package java_output_formatting;

public class Solution {
    
}
