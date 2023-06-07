import java.util.Scanner;
 
public class Pattern3
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Number of rows you want in this pattern?");
 
        int rows = scanner.nextInt();
 
        System.out.println("----Pattern is----");
        for (int i = 1; i <= rows; i++) 
        {
 
 
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
 
 
 
            for (int j = i; j <= rows; j++) 
            { 
                System.out.print(j); 
            } 
 
            System.out.println(); 
        } 
 
 
 
        for (int i = rows-1; i >= 1; i--) 
        {
 
 
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
 
 
 
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j);
            }
 
            System.out.println();
        }
 
 
 
        scanner.close();
    }
}