import java.util.*;

public class Main1
{
public void printstar()
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(i=0;i<n;i++)
{
for(int j=1;j<=n-i;j++)
System.out.println(" ");

for(int j=1;j<=2*i-1;j++)
if(i==n)
System.out.print("*");
else
if((j==1)||(j==2*i-1))
System.out.print("*");
else
System.out.print(" ");
}
}
public static void main(String[] args)
{

Main1 m=new Main1();
m.printstar();
}
}