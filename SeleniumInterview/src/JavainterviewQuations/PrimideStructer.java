package JavainterviewQuations;

public class PrimideStructer {
public void structer(int k){
	 for(int i=0;i<5;i++) {
         for(int j=0;j<k-i;j++) {
        	 System.out.print(j);
             System.out.print(" ");
         }
        for(int n=0;n<=i;n++) {
        	System.out.print(n);
            System.out.print("* ");
        }
        System.out.println();  
    }
}
public static void main (String[]arg){
	PrimideStructer a = new PrimideStructer();
	a.structer(7);
}
}
