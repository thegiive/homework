package charpter1;

public class q1_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean checkIfRepeat(String input){
		boolean[] arr = new boolean[100];
		
		for( char c : input.toCharArray()){
			int index = c - '0' ; 
			if(arr[index]){
				return true ;
			}else{
				arr[index] = true ; 
			}
		}

		return false;
	}

}
