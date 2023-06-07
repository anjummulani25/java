public class Pyramid
 {	
	static void generatePyramidTriangle(int rows)
{
		
		 for(int i=1; i<= rows; i++)
{             
                    for(int j=0; j < i; j++)
{
                        System.out.print("*");
                    }            
                    
                    System.out.println("");
                 }
		}
 
	public static void main(String args[])
{ 
Pyramid p=new Pyramid();

		
		p.generatePyramidTriangle(10); 
	}
}