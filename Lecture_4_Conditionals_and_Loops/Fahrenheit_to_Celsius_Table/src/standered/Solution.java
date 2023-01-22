package standered;

import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
        
        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();
        
        int c,f;
        
        f = S;
        while(E > f){
            
          c = (f-32)*5/9;
            System.out.println(f+" "+c);
            
            f = f+W;
        }
        
	}

}