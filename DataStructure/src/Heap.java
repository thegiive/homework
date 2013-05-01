import java.util.Arrays;


public class Heap {
	private int[] arr ;
	private int index ; 
	
	public Heap(){
		arr = new int[100];
		index = 0 ; 
	}
	
	public void add(int input){
		arr[++index] = input ;
		int ti = index ; 
		while(ti != 1){
			if(arr[ti/2] > arr[ti]){
				int t = arr[ti/2] ; 
				arr[ti/2] = arr[ti]; 
				arr[ti] = t ; 
				ti /= 2 ; 
			}else{
				break ; 
			}
		}
	}
	
	private int getMinLeaf(int ti){
		if(ti*2 <= index ){
			if( ti*2+1 <= index ){
				if( arr[ti*2] <= arr[ti*2+1]){
					return ti*2 ; 
				}else{
					return ti*2 +1 ;
				}
			}else{
				return ti*2 ; 
			}
		}else{
			return -1 ; 
		}
	}
	
	public int getMin(){
		int result = arr[1]; 
		arr[1] = arr[index--] ;

		int ti = 1 ;
		while(ti != index){
			int leaf_index = getMinLeaf(ti);
			if(leaf_index != -1 ){
				if(arr[ti] > arr[leaf_index]){
					int t = arr[leaf_index];
					arr[leaf_index] = arr[ti]; 
					arr[ti] = t ; 
					ti = leaf_index; 
				}else{
					break ; 
				}
			}else{
				break ; 
			}
		}
		
		return result ; 
	}
	
	public String showContent(){
		String content = ""; 
		for(int i = 1 ; i <= index ; i++){
			content += arr[i]+",";
		}
//		System.out.println(content);
		return content ; 
	}

}
