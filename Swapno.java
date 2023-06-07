public class Swapno

{
public void swap()
{
int a=10,b=5;
a=a+b;
b=a-b;
a=a-b;
System.out.println("nos after swap"+a+"and"+b);
}
public static void main(String[] args)
{
Swapno s=new Swapno();
s.swap();
} 
}
