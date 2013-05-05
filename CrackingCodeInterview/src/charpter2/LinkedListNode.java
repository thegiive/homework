package charpter2;

public class LinkedListNode {
	public LinkedListNode next ; 
	public int value ;
	
	public LinkedListNode(){
		value = 0 ; 
		next = null ; 
	}
	
	public boolean hasNext(){
		return !(next == null) ; 
	}
	
	public LinkedListNode(int v){
		next = null ; 
		value = v ; 
	}

}
