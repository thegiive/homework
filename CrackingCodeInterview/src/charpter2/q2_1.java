package charpter2;

import java.util.HashMap;

public class q2_1 {
	public static void deleteRepeat1(LinkedListNode tn){
		HashMap<Integer,Boolean> hm = new HashMap<Integer,Boolean>();
//		LinkedListNode tn = ll ;
		LinkedListNode ptn = tn ;

		hm.put(tn.value, true);
		
		while(tn.hasNext() ){

			tn = tn.next ;
			
			if(hm.get(tn.value) != null){
				if(tn.hasNext()){
//					System.out.println("1ptn"+ptn.next.value+"next"+tn.next.value);
//					ptn.value = tn.next.value ; 
					ptn.next = tn.next ;
//					System.out.println("2ptn"+ptn.next.value+"next"+tn.next.value);
					tn = ptn  ; 

				}else{
					ptn.next = null ;
				}
			}else{
				hm.put(tn.value , true );
				ptn = tn ; 
			}
		}
	}
}
