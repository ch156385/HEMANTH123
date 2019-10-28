package JavainterviewQuations;

public class Rightstructer {
 public void right(int n){
	 int max=1; 
	 for(int i=1; i<n;i++){
		 System.out.println();
		 for(int j=1 ; j<=i; j++){
			 System.out.print(j);
		 }
		 max++;
	 }
 }
 public static void main (String []arg){
	 Rightstructer a = new Rightstructer();
	 a.right(7);
 }
}
