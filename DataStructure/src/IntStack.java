
public class IntStack {
	private int[] contain ;
	private int end ; 
	
	public IntStack(){
		contain = new int[10];
		end = -1 ; 
	}
	
	public int pop(){
		if( end == -1 ){
			return -1 ; 
		}
		return contain[end--]; 
	}
	
	public void push(int i ){
		if( end == contain.length -1 ){
			int[] new_arr = new int[contain.length * 2 ];
			System.arraycopy(contain , 0 , new_arr , 0 , contain.length );
			contain = new_arr ; 
		}
		contain[++end] = i ; 
	}
	
	public int length(){
		return (end+1)  ; 
	}
	
}
