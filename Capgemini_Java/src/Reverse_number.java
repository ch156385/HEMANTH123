/**
 * 
 */

/**
 * @author Hemanth
 *
 */
public class Reverse_number {

	/**
	 * @param args
	 */
	public static void m1(int i){
		int Rev = 0;
		while(i>0){
			Rev = Rev*10+ i%10;
			System.out.println(i%10);
			System.out.println(Rev*10);
			System.out.println(i/10);
			i = i/10;
			}
		System.out.println(Rev);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_number.m1(1234);
	}

}
