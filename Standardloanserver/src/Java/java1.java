package Java;



public class java1 {

	public void verfy(String s1){
		String s2 = "";
		StringBuilder br = new StringBuilder();
		br.append(s1);
		 br=br.reverse();
		for(int i=0 ; i<br.length();i++){
			s2= s2+br.charAt(i);
			}
		System.out.println(s2);
		if (s1.equalsIgnoreCase(s2)){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
	public static void main (String []arg){
		java1 a = new java1();a.verfy("hello");
		a.verfy("121");
		
		
	}
	}

