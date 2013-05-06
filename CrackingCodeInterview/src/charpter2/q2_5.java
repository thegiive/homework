package charpter2;

import java.util.ArrayList;

public class q2_5 {
	public static int solve(LinkedListNode a1 , LinkedListNode a2){
		ArrayList<Integer> arr1 = new ArrayList<Integer>(); 		
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		LinkedListNode t = a1 ; 
		while(t.hasNext()){
			arr1.add(t.value); 
			t = t.next ; 
		}
		arr1.add(t.value); 
		
		t=a2 ; 
		while(t.hasNext()){
			arr2.add(t.value); 
			t = t.next ; 
		}
		arr2.add(t.value); 

		int result1 = 0 ; 
		for(int i = arr1.size() - 1  ; i >= 0  ; i--){
			result1 = result1 * 10 + arr1.get(i);   
		}
		
		int result2 = 0 ; 
		for(int i = arr2.size() - 1  ; i >= 0  ; i--){
			result2 = result2 * 10 + arr2.get(i);   
		}
		
		return result1 + result2 ; 

	}
}
