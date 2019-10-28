
public class Max_number_of_three {
	public void m1(int a, int b, int c){
		if(a>b && a>c){
			System.out.println(a);
		}
		else if(b>a && b>c){
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		Max_number_of_three a = new Max_number_of_three();
		a.m1(10, 61, 14);
	}

}
