public class min
{
  public static void main(String args[])
  {
    int [] numbers={23,75,120,5,15};
    int min,i;
    min=Integer.MAX_VALUE; // INTEGER.MAX_VALUE- IT assigns the max value from the array to min
    for(i=0;i<=4;i++)
    {
      if(min > numbers[i]) //Here we check if min > elements of array
      {
        min=numbers[i];
      }
    }
    System.out.println("Minimum number is "+ min);
   }
}



//WORKING
//min is assigned value 120
//for loop gets start
//the if condition checks if the the number next to it is small if yes then assign min that value
//Eg- if(120 > 23) it is true then assign min 23
//if(23 > 120) it is false  min is still 23
//if(23 > 75) it is false  min is still 23
//if(23 > 5)  it is true then assign min 5
//if(5 >15) it is false  min is still 5
//exits loop
//prints smallest value which is 5 
