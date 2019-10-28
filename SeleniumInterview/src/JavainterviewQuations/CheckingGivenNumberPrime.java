package JavainterviewQuations;

public class CheckingGivenNumberPrime {
public void verfy(int n){
	int count =0;
	for(int i=2;i<n;i++){
		count =0;
		if(n%i==0){
			count =count+1;
		}
	}
	if(count >=1){
		System.out.println("givenbumberis not prime");
	}
	else{
		System.out.println("givennuber is prime");
	}
}
public static void main (String []arg){
	CheckingGivenNumberPrime a = new CheckingGivenNumberPrime();
	a.verfy(10);
}
}
