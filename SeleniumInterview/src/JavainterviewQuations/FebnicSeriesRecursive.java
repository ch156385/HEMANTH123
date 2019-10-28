package JavainterviewQuations;

public class FebnicSeriesRecursive {
	static int n1=0,n2=1,n3 =0;
		 static void fb(int k){
	 if(k>0){
		 
		 n3 = n1+n2;
		 n1 = n2;
		 n2=n3;
		System.out.print(n3);	
		fb(k-1);
	 }
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int count =10;
	System.out.print(n1);
	System.out.print(n2);
	fb(count-2);
}
}
