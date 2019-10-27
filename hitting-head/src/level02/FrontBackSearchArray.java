package level02;

public class FrontBackSearchArray {
	
	
	private boolean frontBackSearch(int[]arr,int start,int end,int key)
	{
		while(start<end)
		{
			if(arr[end]==key) return true;
			if(arr[start]==key) return true;
			
			start++;
			end--;
		}
		return false;
	}

	
	public static void main(String[] args) {
		int[] arr = {2,3,15,7,19,11};
		FrontBackSearchArray frontBackSearchArray = new FrontBackSearchArray();
		boolean frontBackSearch = frontBackSearchArray.frontBackSearch(arr,0,arr.length-1,5);
		System.out.println(frontBackSearch);
	}
}
