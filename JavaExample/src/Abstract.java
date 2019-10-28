abstract class X{
	public abstract  void add(int i, int j);
	public abstract void sub(int i,int j);
	public abstract void mul(int i, int j);
	public void setup(){
		System.out.println("hello boys");
	}
	X(){
		System.out.println("abstract constructer");
	}
}
public class Abstract extends X{
public static void main (String arg[]){
	Abstract a = new Abstract ();
	a.add(40, 30);
	a.sub(1000, 40);
	a.mul(100, 100);
}

public void add(int i, int j) {
	// TODO Auto-generated method stub
	int c=0;
	c =i+j;
	System.out.println(c);
}

@Override
public void sub(int i, int j) {
	// TODO Auto-generated method stub
	int c=0;
	c =i-j;
	System.out.println(c);
}

@Override
public void mul(int i, int j) {
	// TODO Auto-generated method stub
	int c=0;
	c =i*j;
	System.out.println(c);
}
}
