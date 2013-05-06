package charpter2;

public class q2_6 {
	public static LinkedListNode solve(LinkedListNode in){
		LinkedListNode t = in ;

		while(t.hasNext()){
			if(t.value >= 0 ){
				t.value = - t.value ; 
				t = t.next ; 
			}else{
				break ; 
			}
		}
		
		LinkedListNode t1 = in ;
		while(t1.hasNext()){
			if(t1.value < 0){
				t1.value = - t1.value ; 
				t1 = t1.next ; 
			}else{
				break ; 
			}
		}
		
		if(t.hasNext()){
			return t ; 
		}else{
			return null; 			
		}
	}
}
