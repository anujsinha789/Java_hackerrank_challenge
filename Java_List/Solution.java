import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // int[] arr = new int[n];
        List arr = new ArrayList();
        for(int i = 0 ; i < n ; ++i){
            arr.add(in.nextInt());
        }
        int q = in.nextInt();
        while(q > 0){
            String type = in.next();
            switch(type){
                case "Insert" : int x = 0 , y = 0;
                                x = in.nextInt();
                                y = in.nextInt();
                                arr.add(x,y);
                                break;
                case "Delete" : int element = in.nextInt();
                                arr.remove(element);
                                break;
                default : break;
                                
            }
            q -= 1;
        }
        for(int i = 0 ; i < arr.size() ; ++i){
            System.out.print(arr.get(i) + " ");
        }
    }
}