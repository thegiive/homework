package charpter2;

public class q2_2 {
	public static int findKNode(LinkedListNode ll , int k ){
		LinkedListNode fnode = ll ; 
		LinkedListNode snode = ll ; 
		
		for(int i =0 ; i < k-1 ; i++){
			fnode = fnode.next ; 
		}
		while(fnode.hasNext()){
			fnode = fnode.next ; 
			snode = snode.next ; 
		}
		return snode.value ; 
	}
}
