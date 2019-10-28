/**
 * 
 */

/**
 * @author Hemanth
 *
 */
public class Sum_of_digits_in_number {

	/**
	 * @param args
	 */
	public static void m1(int i){
		int Sum = 0;
	while(i>0){
		Sum = Sum + i%10;
	
		i = i/10;
		}
	System.out.println(Sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum_of_digits_in_number a1 = new Sum_of_digits_in_number();
		a1.m1(1234);
	}

}
