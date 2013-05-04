package POJ3253;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main{
	

	   public static void main(String args[]) throws Exception
	    {
	            Scanner cin=new Scanner(System.in);
	            int testCase = cin.nextInt();
	            int[] input_arr = new int[testCase];
	            for(int i = 0 ; i < testCase ; i ++){
	                int v = cin.nextInt();
	                input_arr[i] = v ; 
	            }
	            long r = getMin(input_arr); 
	            System.out.println(r);
	    }
	   
	   public static long getMin(int[] input_arr){
	        Comparator<Long> comparator = new IntMinComparator();
	        PriorityQueue<Long> queue = new PriorityQueue<Long>(input_arr.length, comparator);

	        for(int i : input_arr){
	        		queue.add((long)i);
	        }
	        long result = 0 ; 
	        while(queue.size() > 1 ){
	        		long t = queue.remove() + queue.remove() ; 
	        		result += t ; 
	        		queue.add(t);
	        }
	        return result ; 
	   }
}
class IntMinComparator implements Comparator<Long>
{
 @Override
 public int compare(Long  x, Long y)
 {
     // Assume neither string is null. Real code should
     // probably be more robust
     if (x < y)
     {
         return -1;
     }
     if (x > y)
     {
         return 1;
     }
     return 0;
 }

}
 
