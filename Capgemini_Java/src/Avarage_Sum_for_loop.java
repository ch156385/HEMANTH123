/**
 * 
 */

/**
 * @author Hemanth
 *
 */
public class Avarage_Sum_for_loop {

	/**
	 * sum and avg by using for loop
	 */
	public void m1(int i){
	int c =0;
		for(int j = 0;j<=i;j++){
		c = c+j;
		}
		int avg = c/i;
		System.out.println(c);
		System.out.println(avg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avarage_Sum_for_loop a1 = new Avarage_Sum_for_loop();
		a1.m1(10);
	}

}
