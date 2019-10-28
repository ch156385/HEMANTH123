
public class Factorial {
public void fact(int n){
	int fact =1;
	for(int i =1;i<=n;i++){
		fact = fact*i;
		}
	System.out.println(fact);
}
public static void main (String [] arg){
	Factorial s1 = new Factorial();
	s1.fact(6);
}
}
