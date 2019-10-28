/**
 * 
 */

/**
 * @author Hemanth
 *
 */
public class Even_and_Add_number {

	/**
	 * @param args
	 */
	public static void m1(int i){
		if(i%2==0){
			System.out.println("Even" +i);
		}
		else
		{
			System.out.println("No" + i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =2; i<= 100;i++){
			Even_and_Add_number a1 = new Even_and_Add_number();
			a1.m1(i);
		}
	}

}
