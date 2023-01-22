package standered;

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
	Scanner sc = new Scanner(System.in);
	
        String str = sc.next();
        char ch = str.charAt(0);
        
    	if (Character.isUpperCase(ch)){
            System.out.println("1");
        }
        else if (Character.isLowerCase(ch)){
            System.out.println("0");
        }
        else{
            System.out.println("-1");
        }
    }
}