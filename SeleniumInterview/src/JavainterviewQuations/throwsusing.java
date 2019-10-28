package JavainterviewQuations;

public class throwsusing {
	public int  m1(int i)throws ArithmeticException{
		int j=0;
		int  c = i%j;
		return c;
		
	}
	public static void main(String[] args) {
		throwsusing  a = new throwsusing ();
		try{
			System.out.println(a.m1(10));
		}
		catch(ArithmeticException e){
			System.out.println(" ok its not divisibule ra");
		}
	}
}

