class A{
	public void add(int i, int j){
		int c = 0;
		c=i+j;
		System.out.println(c);
	}
}
class B extends A {
	public void Sub(int i , int j){
		int c=0;
		c=i-j;
		System.out.println(c);
	}
}
public class Inheretience extends B {
public void mul(int i , int j){
	int c =0;
	c =i*j;
	System.out.println(c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a = new A();
B b= new B();
Inheretience c =  new Inheretience();
a.add(10, 40);
b.Sub(40, 5);
c.mul(40, 80);
	}

}
