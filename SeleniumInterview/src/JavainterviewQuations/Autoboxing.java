package JavainterviewQuations;

public class Autoboxing {
	static Integer I = 10;// boxing concept
	public static void mi(Integer m){
		int k= m;//unboxing concept
		System.out.println(k);
	}
public static void main(String[] args) {
int i =I;//unboxing 
mi(i);//boxing
}
}
