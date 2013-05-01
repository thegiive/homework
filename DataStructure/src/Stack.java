import java.util.ArrayList;


public class Stack <T>{
	private ArrayList<T> contain; 
	private int index ; 
	
	public Stack(T s){
		contain = new ArrayList<T>();
		index = 0 ; 
	}
	
	public T pop(int i){
		return contain.get(i) ; 
	}
	
	public void add (T t){
		contain.add(t); 
	}

}
