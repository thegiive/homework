package POJ3253;

import static org.junit.Assert.*;

import java.util.Comparator;
import java.util.PriorityQueue;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		int[] arr = { 8,5,8};
		assertEquals(34 , Main.getMin(arr)); 	
	}
	
	@Test
	public void test1() {
		int[] arr = new int[20000];
		for(int i = 0 ; i< 20000 ; i++){
			arr[i] = 50000 ; 
		}
		assertEquals((new Long("14361600000")).longValue() , Main.getMin(arr)); 	
	}
	
	
	@Test
	public void testQueue(){
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(10 , new IntMaxComparator());
        queue.add(3);
        queue.add(32);

        queue.add(21);
        queue.add(1);
        queue.add(10);

        while(queue.size() > 0){
        		System.out.println(queue.remove());
        }
        

	}

}

class IntMaxComparator implements Comparator<Integer>
{
 @Override
 public int compare(Integer x, Integer y)
 {
     // Assume neither string is null. Real code should
     // probably be more robust
     if (x > y)
     {
         return -1;
     }
     if (x < y)
     {
         return 1;
     }
     return 0;
 }

}
