public class Trianglepat{	

	static void patte(int rows){
		int num = 1;
		

		 for (int i = 1; i <= rows; i++) {
	         for (int j = 1; j <= i; j++) {
	            System.out.print(num + " ");
	            num++;
	         }	 
	         System.out.println();
	      }
	}	
 
	public static void main(String args[]){ 
		 
	Trianglepat t=new Trianglepat();
		t.patte(5); 
	}
}