public class GeneratePyramidTriangleExample {	
	static void generatePyramidTriangle(int rows)
{
		
		 for(int i=1; i<= rows; i++){             
                    for(int j=0; j < i; j++){
                        System.out.print("*");
                    }            
                    
                    System.out.println("");
                 }
	}	
 
	public static void main(String args[]){ 
		
		generatePyramidTriangle(10); 
	}