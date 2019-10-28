
public class Testing {

	public void m1 (String s1){
			String s2 = "";
			StringBuilder br = new StringBuilder();
			br.append(s1);
			br = br.reverse();
	for(int i = 0; i<br.length();i++){
		s2 = s2+br.charAt(i);
	}
	System.out.println(s2);
	if(s1.equalsIgnoreCase(s2)){
		System.out.println("yes");
	}
	else{
		System.out.println("no");
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testing a = new Testing();
		a.m1("121");
	}

}
