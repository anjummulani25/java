import java.util.Scanner;
 
public class Pattern1
{
    public void pattern()
 {
        Scanner scanner = new Scanner(System.in);         
        System.out.println("Number of rows you want in this pattern?");         
        int rows = scanner.nextInt();         
        System.out.println("----Pattern is----");         
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i+" ");
            }
 
            System.out.println();
        }
 
      
    }
public static void main(String[] args)
{
Pattern1 p=new Pattern1();
p.pattern();
}
}