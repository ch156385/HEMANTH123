package JavainterviewQuations;

public class Factorial {
	public void fb(int number){
		 int i,fact=1;  
		  //It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
	

 public static void main (String []arg){
	 Factorial f = new Factorial();
	 f.fb(6);
	
	}  

}