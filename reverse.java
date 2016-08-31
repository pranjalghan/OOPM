import java.util.*;
class reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,d;
System.out.println("enter the no.");
n=sc.nextInt();
int x=n;
int r=0;
while(x>0)
{
d=x%10;
r=r*10+d;
x=x/10;
}  
System.out.println("the REVERSE NO IS="+r);
}
}
