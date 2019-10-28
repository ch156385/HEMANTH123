/**
 * 
 */

/**
 * @author Hemanth
 *
 */
public class Swap_two_numbers_with_thirdvarible {

	/**
	 * Method 1
	 */
	public void m1( int a, int b){
	int c = 0;
	c = a;
	a = b;
	b=c;
	System.out.println(a);
	System.out.println(b);
	}
	public static void main(String[] args) {
		Swap_two_numbers_with_thirdvarible a = new Swap_two_numbers_with_thirdvarible();
		a.m1(40, 20);
	}

}
