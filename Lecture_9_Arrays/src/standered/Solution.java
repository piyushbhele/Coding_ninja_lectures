package standered;

public class Solution {
    public static void sortZeroesAndOne(int[] arr) {
        
        int count = 0; // counts the no of zeros in arr
      	int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count++;
        }
  
  
        // loop fills the arr with 0 until count
        for (int i = 0; i < count; i++){
            arr[i] = 0;
        }
        // loop fills remaining arr space with 1
        for (int i = count; i < n; i++){
            arr[i] = 1;
        }
        
        print(arr);
    }
        
        public static void print(int arr[]) {
        	for(int i = 0; i < arr.length; i++) {
        		System.out.print(arr[i]+" ");
        	}
        	 
  }
   
    public static void main(String args[]) {
    	
    	int arr[] = {0,1,1,0,1,0,1};
    	sortZeroesAndOne(arr);
    	
    }
    
    
}
