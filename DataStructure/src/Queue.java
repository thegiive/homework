import java.util.ArrayList;


public class Queue <T>{
	private ArrayList<T> arr ; 
	private int head , tail ; 
	
	public Queue(){
		arr = new ArrayList<T>();
		head = 0 ; 
		tail = -1 ; 
	}
	
	public void push(T t){
		arr.add(++tail , t); 
	}
	
	public T pop(){
		if( head > tail ){
			return null ; 
		}
		T t = arr.get(head++) ; 
		if( head > tail ){
			head = 0 ; 
			tail = -1 ; 
		}
		return t ; 
	}
	
	public int length(){
		return tail - head + 1 ; 
	}
}
