package JavainterviewQuations;

public class Throwusing {
	void age(int i){
		if(i<18){
			throw new ArithmeticException("not good");
		}
		else{
			System.out.println("ok");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throwusing a = new Throwusing();
		a.age(10);
	}

}
