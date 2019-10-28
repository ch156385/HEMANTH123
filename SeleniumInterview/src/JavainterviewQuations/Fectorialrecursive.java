package JavainterviewQuations;

public class Fectorialrecursive{
int fact (int n){
	if(n==1){
		return 1;
	}
	else {
		return(n*fact(n-1));
	}
	
}
public static void main(String [] args){
	Fectorialrecursive f = new Fectorialrecursive();
	int s = f.fact(5);
	System.out.println(s);
}
}
