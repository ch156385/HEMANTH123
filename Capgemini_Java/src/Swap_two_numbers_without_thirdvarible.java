/**
 * 
 */

/**
 * @author Hemanth
 *
 */
public class Swap_two_numbers_without_thirdvarible {

public void m1(int a, int b){
	a= a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
}
	public static void main(String[] args) {
		
		Swap_two_numbers_without_thirdvarible a = new Swap_two_numbers_without_thirdvarible();
		a.m1(12, 14);
	}

}
