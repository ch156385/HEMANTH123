package JavainterviewQuations;

public class CountingLeatersinWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "abababsscscsc";
char[] c= s.toCharArray();
int sz= c.length;
int i= 0 ,j=0,counter =0;
for(i=0;i<sz;++i){
	counter =0;
	for(j=0;j<sz;++j){
		if(j<i&&c[i]==c[j]){
			break;
		}
		if(c[j]==c[i]){
			counter++;
		}
		if(j==sz-1){
			//System.out.println(j);
			System.out.println(j);
			System.out.println(sz-1);
			System.out.println("hello"  +c[i]+ " hi"+ counter);
		}
	}
	
	
}
	}

}
