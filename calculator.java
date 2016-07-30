public class calculator
{
    public static void main(String args[])
    {
        int x,y;
        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);
        System.out.println("enter the 1st number:" +x);
        System.out.println("enter the 2nd number:" +y);
        add(x,y);
        sub(x,y);
        multiply(x,y);
        divide(x,y);
    }
    public static void add(int x,int y)
    {
        int c;
        c=x+y;
        System.out.println("the added no is :" +c);
    }
    public static void sub(int x,int y)
    {
        int q;
        q=x-y;
        System.out.println("the sub no is :" +q);
    }
    public static void multiply(int x,int y)
    {
        int w;
        w=x*y;
        System.out.println("the multiplied no is :" +w);
    }
    public static void divide(int x,int y)
    {
        int m;
        m=x/y;
        System.out.println("the divided no is :" +m);
    }
}
