interface M{
	public abstract  void add(int i, int j);
	public abstract void sub(int i,int j);
	public abstract void mul(int i, int j);
}
public class Interface  implements M{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface a = new Interface ();
			a.add(40, 30);
			a.sub(1000, 40);
			a.mul(100, 100);
	}

	@Override
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
