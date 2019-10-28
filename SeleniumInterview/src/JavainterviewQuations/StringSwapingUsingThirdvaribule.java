package JavainterviewQuations;

public class StringSwapingUsingThirdvaribule {
public void swap(String s1, String s2){
	String s3 ="";
	 s3 = s1;
	 s1=s2;
	 s2=s3;
	 System.out.println(s1);
	 System.out.println(s2);
}
public static void main(String[]arg){
	StringSwapingUsingThirdvaribule a = new StringSwapingUsingThirdvaribule();
	a.swap("Hemanth","Reddy");
}
}
