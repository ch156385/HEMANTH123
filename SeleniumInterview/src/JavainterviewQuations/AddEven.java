package JavainterviewQuations;

public class AddEven {
	public void verfy(int k , int l){
	     for(int i=k;i<l;i++){
	    	 if(i%2==0){
	    		 System.out.println("even"  +i);
	    	 }
	    	 else{
	    		 System.out.println("odd"  +i);
	    	 }
	     }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddEven a = new AddEven();
		a.verfy(2, 100);
	}

}
