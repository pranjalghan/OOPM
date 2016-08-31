import.java.util.*;
class reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in)
int n,d;
System.out.println("enter the no.");
n=sc.nextInt();
int x=n;
int r=0;
while(n>0)
{
d=d%10;
r=r*10+d;
n=n/10;
}
if(x==n)
{
System.out.println("the no. is palindrome");
}
else
{
System.out.println("the no. is not palindrome");
}
}
}
