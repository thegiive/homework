package charpter1;

public class q1_5 {
	public static String encode(String input){
		 StringBuilder re = new StringBuilder();
		 int num = 0 ; 
		 char[] cchar_arr =  input.toCharArray();
		 char tchar = cchar_arr[0] ; 
		 
		 for( char c : cchar_arr){
			 if( tchar != c ){
				 re.append(tchar);
				 re.append(num);
				 tchar = c ; 
				 num = 1 ; 
			 }else{
				 num ++ ;
			 }
		 }
		 re.append(tchar);
		 re.append(num); 
		 
		 if( re.toString().length() >= input.length() ) {
			 return input ; 
		 }else{
			 return re.toString() ; 
		 }
	}
}
