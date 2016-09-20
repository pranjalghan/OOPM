public class area
{
 float l,b;
 void area(int l,int b)
 {
  float area;
  area=l*b;
  System.out.println("AREA="+area);
 }
 void area(double l,double b)
 {
 double area;
 area=l*b;
 System.out.println("AREA="+area);
 }
}
class demo
{
 public static void main(String args[])
 {
  area x=new area();
  x.area(2,3);
  x.area(2.14,3.16);
 }
}
