
public class Knapsack01 {
	
	public static int number =0 ;
	public static int get(int[] weight, int[] value , int max_weight , int index, int remain_weight , int[][] cache){
		if( cache[index][remain_weight] != -1 ){
			return cache[index][remain_weight]; 
		}
		
		int result = 0 ;
		
		if( index == weight.length ){
			return 0 ; 
		}
		
		if(  remain_weight < weight[index]){
			result = get(weight,value , max_weight , index+1 ,remain_weight ,cache);
		}else{
			result = Math.max(get(weight,value , max_weight , index+1 ,remain_weight , cache ) , get(weight,value , max_weight , index+1 ,remain_weight-weight[index] , cache )+value[index]); 
		}
		cache[index][remain_weight] = result ; 
		System.out.println(number++);
		return result ; 
	}
	
	
}
