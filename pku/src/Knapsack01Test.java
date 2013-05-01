import static org.junit.Assert.*;

import org.junit.Test;


public class Knapsack01Test {

	@Test
	public void testGet() {
		int[] weight = { 2,1,3,2 , 1 ,3 } ; 
		int[] value = {3,2,4,2,3,4} ; 
		int max_weight = 5 ; 
		int[][] cache = new int[100][100];
		for(int i = 0 ; i< 100 ; i++){
			for(int j =0 ; j<100 ; j++){
				cache[i][j] = -1 ; 
			}
		}
		assertEquals( 9 , Knapsack01.get(weight ,value , max_weight , 0 , max_weight , cache) ); 
	}

}
