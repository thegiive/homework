package charpter1;


import java.util.Stack;

public class q1_7 {
	public static int[][] solve(int[][] arr){
		Stack<Integer> xs = new Stack<Integer>(); 
		Stack<Integer> ys = new Stack<Integer>(); 
		
		for(int i = 0 ; i< arr.length ; i++){
			for( int j =0 ; j < arr.length ; j++){
				if(arr[i][j] == 0){
					xs.push(i); 
					ys.push(j); 
				}
			}
		}
		
		while(!xs.empty()){
			int tx = xs.pop();
			for(int j = 0 ; j < arr.length ; j++){
				arr[tx][j] = 0 ; 
			}
		}
		
		while(!ys.empty()){
			int ty = ys.pop();
			for(int i = 0 ; i < arr.length ; i++){
				arr[i][ty] = 0 ; 
			}
		}
		
		return arr; 
	}
}
