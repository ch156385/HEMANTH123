/**
 * 
 */

/**
 * @author Hemanth
 *
 */
public class Compound_Interest {

	/**
	 * a = P(1+r/n)power(time)
	 * @return 
	 * 
	 */
	public static void m1(int p , int n, int r ){
		double a = p*Math.pow((1+r/n),n);
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compound_Interest.m1(2000, 3, 2);
	}

}
