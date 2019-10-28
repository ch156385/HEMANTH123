/**
 * 
 */

/**
 * @author Hemanth
 *
 */
interface  Method1{
	
	public void m1();
	public void m2();
} class Interface_Example implements Method1 {

	/**
	 * @param args
	 */ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_Example a = new Interface_Example();
		a.m1();
		a.m2();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Yes");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("No");
	}

}
