package charpter2;

public class q2_3 {
	
	public static LinkedListNode solve(LinkedListNode ll){
		ll.value = ll.next.value ; 
		ll.next = ll.next.next ;
		return ll ; 
	}

}
