
public class IntQueue {
	private int[] arr ; 
	private int head , tail ; 
	
	public IntQueue(){
		arr = new int[100];
		head = 0 ; 
		tail = -1 ; 
	}
	
	public void push(int i){
		arr[++tail] = i ; 
	}
	
	public int pop(){
		if( head > tail){
			return -1 ; 
		}
		int r = arr[head++] ;
		if( head > tail){
			head = 0 ; 
			tail = -1 ; 
		}
		return r ; 
	}
	
	public int length(){
		if( head > tail ){
			return 0 ; 
		}
		return tail - head +1 ; 
	}
}
