package JavainterviewQuations;

public class RecuresnumerWithoutloop {
public void  printnumber(int i){
if(i<=100){
	System.out.println(i);
	printnumber(i+1);
	}
}
public static void main (String []arg){
	RecuresnumerWithoutloop a = new  RecuresnumerWithoutloop();
	 a.printnumber(1);
}
}
