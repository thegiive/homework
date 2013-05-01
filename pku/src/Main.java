//http://poj.org/problem?id=3617
import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String args[]) throws Exception
    {
            Scanner cin=new Scanner(System.in);
            int len = cin.nextInt();
            cin.nextLine();
            char[] input = new char[len];
            for(int i = 0 ; i < len ; i++){
                        String t = cin.nextLine();
                        input[i] = t.toCharArray()[0] ;
            }
            char[] a = re(input).toCharArray() ; 
            for(int i = 0 ; i < a.length ; i ++ ){
            		System.out.print(a[i]) ; 
            		if(( i != 0 ) && ((i+1) % 80 == 0) ){
            			System.out.print("\n");
            		}
            }
    }
    
    public static String re(char[] arr){
    		int a =0 ; 
    		int b = arr.length - 1 ; 
    		String result = ""; 
    		while(a <= b ){
    			boolean left = true ; 
    			for( int i = 0 ; a + i <= b ;i++){
    				if( arr[a+i] < arr[b-i] ){
    					left = true ; 
    					break ; 
    				}
    				if(arr[a+i] > arr[b-i]){
    					left = false ;
    					break ; 
    				}
    			}
    			
    			if(left){
    				result += arr[a++]; 
    			}else{
    				result += arr[b--]; 
    			}
    		}
    		return result ; 
    		
    }

            
        	public static String rearrange(char[] arr){		
        		String temp = new String(arr);
        		String result = ""; 
        		for( int i = 0 ; i < arr.length ; i++){
        			char[] tarr = temp.toCharArray() ; 
        			if(whoIsWin(tarr)){
        				// take first char
        				temp = ""; 
        				for(int j = 1 ; j < tarr.length ; j++){
        					temp += tarr[j] ; 
        				}
        				result += tarr[0]; 
        			}else{
        				// take last char 
        				temp = ""; 
        				for(int j = 0 ; j < tarr.length -1 ; j++){
        					temp += tarr[j] ; 
        				}
        				result += tarr[tarr.length -1 ]; 

        			}
        			
        		}
        		return result ; 
        	}
        	
        	public static boolean whoIsWin(char[] input_arr){
        		// true is first line win 
        		// false is last line win 
        		
        		for( int i = 0 ; i < input_arr.length ; i++){
        			int k = input_arr.length - i - 1 ; 
        			if( input_arr[i] < input_arr[k] ){
        				return true ; 
        			}else if(input_arr[i] > input_arr[k] ){
        				return false; 
        			}else{
        				continue ; 
        			}
        		}
        		
        		return true ; 
        	}
}

