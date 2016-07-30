public class calculator
{
    public static void main(String args[])
    {
        int x,y;
        x=IntegerparseInt(args[0]);
        y=IntegerparseInt(args[1]);
        system.out.println("enter the 1st number"+x);
        system.out.println("enter the 2nd number"+y);
        add(x,y);
        sub(x,y);
        multiply(x,y);
        divide(x,y);
    }
}
    public static void add(int x,int y)
    {
        int c;
        c=x+y;
        system.out.println("the added no is c",+c);
    }
    public static void sub(int x,int y)
    {
         int q;
        q=x+y;
        system.out.println("the added no is q",+q);
    }
    public static void multiply(int x,int y)
    {
         int w;
        w=x+y;
        system.out.println("the added no is w",+w);
    }
    public static void divide(int x,int y)
    {
         int m;
        m=x+y;
        system.out.println("the added no is m",+m);
    }
