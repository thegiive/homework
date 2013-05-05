package charpter1;

public class q1_6 {
	public static int[][] rotate(int[][] arr){
		int len = arr.length ; 
		for(int i = 0 ; i < len ; i++){
			for(int j = 0 ; j < len ; j++){
				if(arr[i][j]>=0){
//					int t = arr[i][j] ;
//					arr[i][j] = - arr[j][len-1-i]  ; 
//					arr[j][len - i -1]  =  - arr[ len -i -1  ][ len - 1 -j  ]; 
//					arr[len - i - 1 ][len - j -1 ]  =  - arr[len - j -1][ i  ]; 
//					arr[len-j-1][i] =  - t ; 
					int t = arr[i][j] ;
					arr[i][j] = - arr[len - 1- j][i]  ; 
					arr[len -1 -j ][i]  =  - arr[len -1 -i ][ len - 1 -j  ]; 
					arr[len - i - 1 ][len - j -1 ]  =  - arr[j][ len -i -1  ]; 
					arr[j][len - i -1] =  - t ; 

				}
			}
		}
		
		for(int i = 0 ; i < len ; i++){
			for(int j = 0 ; j < len ; j++){
				arr[i][j] = - arr[i][j] ; 
			}
		}
		return arr ; 
	}
}
