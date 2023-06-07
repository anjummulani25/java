import java.util.*;
public class Main
{
public void fact()
{
int n,sum=0,d;
Scanner s=new Scanner(System.in);
System.out.println("Enter no to chech whether it is armstrong or not");
n=s.nextInt();
int m=n;
while(n!=0)
{
d=n%10;
sum=(sum+(d*d*d));
n=n/10;

}
if(sum==m)
{
System.out.println("no is armstrong");

}
else
{
System.out.println("no is not armstrong");
}
}

public static void main(String[] args)
{
Main m=new Main();
m.fact();
}

}