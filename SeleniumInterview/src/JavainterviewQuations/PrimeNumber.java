package JavainterviewQuations;

public class PrimeNumber {
public void Verify(int i){
	int k=0;
	for (int j = 2;j<i; j++){
		if(i%j==0){
			System.out.println(j);
			 k=k+1;
		}
		}
	if(k>=1){
		System.out.println("given numer is not prime");
	}
	else{
		System.out.println("it is prime");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber a = new PrimeNumber();
		a.Verify(7);
	}

}
