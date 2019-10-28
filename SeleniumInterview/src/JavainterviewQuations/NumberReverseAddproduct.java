package JavainterviewQuations;

public class NumberReverseAddproduct {
public void ReversingNumbrer( int n){
	 int reverse =0;
	 int count =0;
	int  sum =0;
	int mul = 1;
while(n!=0)
{
	 reverse = reverse*10;
	 reverse = reverse +n%10;
	 
	 n = n/10;
	 count++	;
	 sum =sum+n;
	 if(n>=1)
	 mul= mul*n;
}
System.out.println(reverse);
System.out.println(count);
System.out.println(sum);
System.out.println(mul);
}
public static void main (String[]arg){
	NumberReverseAddproduct a = new NumberReverseAddproduct();
	a.ReversingNumbrer(1234567);
}
}
