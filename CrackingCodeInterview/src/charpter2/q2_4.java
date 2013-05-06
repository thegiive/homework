package charpter2;

public class q2_4 {
	public static LinkedListNode solve(LinkedListNode in, int x){
		LinkedListNode start_less_node = new LinkedListNode(0); 
		LinkedListNode start_greater_node = new LinkedListNode(0);
		LinkedListNode less_node = start_less_node;  
		LinkedListNode greater_node = start_greater_node ;

		LinkedListNode tn = in ; 
		
		do{
			if(in.next != null){ in = in.next ;}
			
			if(tn.value >= x){
				greater_node.next  = tn ; 
				greater_node = greater_node.next ; 
				tn.next = null ;
			}else{
				less_node.next  = tn ; 
				less_node = less_node.next ; 
				tn.next= null ; 			
			}
			tn = in ;
		}while(in.hasNext());
		
		if(tn.value >= x){
			greater_node.next  = tn ; 
			greater_node = greater_node.next ; 
			tn.next = null ;
		}else{
			less_node.next  = tn ; 
			less_node = less_node.next ; 
			tn.next= null ; 			
		}
		
//		less_node.next = start_greater_node.next ; 
		less_node.next = start_greater_node ; 

		LinkedListNode result = start_less_node.next ; 
		return result ; 
		
	}

}
