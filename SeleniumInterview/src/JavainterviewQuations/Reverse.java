package JavainterviewQuations;

public class Reverse {
	public void verfy(String s1){
		String s2  ="";
		StringBuilder br = new StringBuilder();
		br.append(s1);
		br=br.reverse();
		for(int i=0 ;i<br.length();i++){
			s2= s2+br.charAt(i);
		}
		System.out.println(s2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse a =new Reverse();
		a.verfy("hello");
	}

}
