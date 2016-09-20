public  class str
{
  public static void main(String arsg[])
{
  String st=new String("Hi");
  String st1=new String("Good Morning");
  System.out.println("The Length of the string 1 is :" +st.length());
  System.out.println("The Length of the string 2 is :" +st1.length());
  System .out.println("The concatinated string is :"+st.concat(st1));
  System.out.println("The  Lower case of string 1 is :" +st.toLowerCase());
  System.out.println("The  Upper case of string 2 is :" +st1.toUpperCase());
  System.out.println("The  substring of string 1 is :" +st.substring(1));
  System.out.println("The  substring case of string 2 is :" +st1.substring(3,7));
  System.out.println("The  charater at position of string 2 is :" +st1.charAt(6));
  System.out.println("checking whether the strings are equal or not? :" +st.equals(st1));
  System.out.println("comparing both the strings :" +st1.compareTo(st));
  System.out.println("The  Index of charater m string 2 is :" +st1.indexOf('M'));
  System.out.println("The  Last index of  O string 2 is :" +st1.lastIndexOf('o'));
  System.out.println("The  trimed result is string 2 is :" +st1.trim());
 }
}
