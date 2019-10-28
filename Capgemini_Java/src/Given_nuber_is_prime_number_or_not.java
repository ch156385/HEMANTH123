/**
 * 
 */

/**
 * @author Hemanth
 *
 */
public class Given_nuber_is_prime_number_or_not {

	/**
	 * @param args
	 */
	public static void m1(int i){
		int count = 0;
		for(int j= 2; j<i;j++){
			if(i%j==0)
				count = count+1;
				break;
				}
		if(count !=0){
			System.out.println("not prime" + i);
		}
		else
		{
			System.out.println("  prime" +i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Given_nuber_is_prime_number_or_not.m1(97);
	}

}
