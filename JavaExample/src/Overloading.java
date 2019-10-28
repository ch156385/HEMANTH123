
public class Overloading {
public void add(){
	System.out.println("hello value");
}
public void add(int i , int j){
	int c = 0;
	c = i+j;
	System.out.println(c);
}
public void add(float a , float b){
	float c=0;
	c = a+b;
	System.out.println(c);
}
public void add(String s1, String s2){
	String s3  =s1+s2;
	System.out.println(s3);
}
public static void main (String []arg){
	Overloading  v = new Overloading();
	v.add();
	v.add(10,14);
	v.add("hemant","reddy");
}
}
