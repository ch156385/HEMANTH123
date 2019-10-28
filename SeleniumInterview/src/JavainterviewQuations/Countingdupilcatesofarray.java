package JavainterviewQuations;

public class Countingdupilcatesofarray {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,52,6,6};
		for(int i=0;i<arr.length-1;i++)
		{
			for (int j=i+1;j<arr.length-1;j++){
				if(arr[i]==arr[j]){
					System.out.println(arr[j]);
				}
			}
		}
	}

}
