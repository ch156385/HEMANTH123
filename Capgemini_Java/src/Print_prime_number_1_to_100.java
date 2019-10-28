

/**
 * 
 */

/**
 * @author Hemanth
 *
 */
public class Print_prime_number_1_to_100 {

	/**
	 * @param args
	 */
	public void verfy(int s, int l){
		int k =0;
		int i ,j=2;
				
		for(  i=s;i<=l;i++ ){
			 k =0;
			for(j =2;j<=i;j++){
				if(i%j==0){
				
					k=k+1;
				}
			}
			if(k<=1){
				System.out.println("it is not prime"+i);
				}
			else{
				System.out.println("it is prime" +i);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print_prime_number_1_to_100 a  = new Print_prime_number_1_to_100 ();
		a.verfy(2, 100);
	}

}
