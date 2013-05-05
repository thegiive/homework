package charpter1;

public class q1_4 {
	public static char[] addSpace(char[] input , int length){
		int space_count = 0 ;
		for( int i = 0 ; i < length ; i++){
			if(input[i] == ' '){
				space_count ++ ; 
			}
		}
		int new_length = length + space_count * 2 - 1  ; 
		for( int i = length -1 ; i >= 0 ; i --){
			if(input[i] == ' '){
				input[new_length] = '0'; 
				input[new_length-1] = '2'; 
				input[new_length-2] = '%'; 
				new_length -= 3 ;
			}else{
				input[new_length--] = input[i]; 
			}
		}
		return input ; 
	}
	
	public static String trans(char[] arr){
		StringBuilder result = new StringBuilder();
		for( char c : arr){
			if( c != ' ' ){
				result.append(c) ; 
			}
		}
		return result.toString();
	}
}
