
public class Constructer {
public Constructer(){
	System.out.println("default constructer");
}
public Constructer(int i, int j)
{
	int c =0;
	c =i+j;
	System.out.println(c);
}
public  void mul(int i , int j){
	int c=0;
	c =i*j;
	System.out.println(c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructer a = new Constructer();
		a.mul(10, 120);
		Constructer b =new Constructer(10,110);
	}

}
