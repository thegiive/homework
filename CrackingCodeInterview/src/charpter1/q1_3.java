package charpter1;

public class q1_3 {

	public static boolean checkIfReorderString(String input1 , String input2){
		if(  input1.length() != input2.length() ){
			return false ; 
		}
		
		int[] input1_arr = new int[100];
		int[] input2_arr = new int[100];
		
		for(char c : input1.toCharArray()){
			input1_arr[c - '0'] ++ ; 
		}
		
		for(char c : input2.toCharArray()){
			input2_arr[c - '0'] ++ ; 
		}
		
		for( int i = 0 ; i < input1_arr.length ; i++){
			if( input1_arr[i] != input2_arr[i]){
				return false ; 
			}
		}
		
		return true ;

	}

}
