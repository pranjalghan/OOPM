public class calculator
{
    public static void main(String args[])
    {
        int x,y;
        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);
        System.out.println("The 1st number:" +x);
        System.out.println("The 2nd number:" +y);
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
        System.out.println("The sub no is :" +q);
    }
    public static void multiply(int x,int y)
    {
        int w;
        w=x*y;
        System.out.println("The multiplied no is :" +w);
    }
    public static void divide(int x,int y)
    {
        int m;
        m=x/y;
        System.out.println("The divided no is :" +m);
    }
}


//OUTPUT//
//The 1st number:20
//The 2nd number:30
//The added no is :50
//The sub no is :-10
//The multiplied no is :600
//The divided no is :0

