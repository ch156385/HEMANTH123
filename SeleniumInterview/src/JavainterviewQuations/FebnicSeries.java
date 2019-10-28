package JavainterviewQuations;

public class FebnicSeries {
public void fb(int i , int j){
	System.out.print(j);
	for (int k =0 ;k<=100;k++){
	int c=i+j;
	System.out.println(c);
	i=j;
	
	j=c;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FebnicSeries f = new FebnicSeries();
		f.fb(0, 1);
	}

}
