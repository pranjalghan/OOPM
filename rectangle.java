public class rectangle
{
 float length,breadth;
 void getdata()
 {
  length=10;
  breadth=20;
 }
 void area()
 {
  float area;
  area=length*breadth;
  System.out.println("AREA="+area);
 }
}
class demo
{
 public static void main(String args[])
{
 rectangle x=new rectangle();
 x.getdata();
 x.area();
 }
}
