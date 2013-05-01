import java.util.ArrayList;


public class Stack <T>{
	private ArrayList<T> contain; 
	private int index ; 
	
	public Stack(){
		contain = new ArrayList<T>();
		index = -1 ; 
	}
	
	public T pop(){
		if( index == -1 ){
			return null ; 
		}
		return contain.get(index--) ; 
	}
	
	public void push (T t){
		contain.add(++index, t); 
	}
	
	public int length(){
		return index +1 ; 
	}

}
