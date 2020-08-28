package com.inet.itr;

class SwapNumbers
{
   public static void main(String args[])
   {
      /*int x, y, temp;
      System.out.println("Enter x and y");
      Scanner in = new Scanner(System.in);
 
      x = in.nextInt();
      y = in.nextInt();
 */
	   int x=10;
	   int y=20;
	   int temp;
      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
 
      temp = x;
      x = y;
      y = temp;
 
      System.out.println("After Swapping\nx = "+x+"\ny = "+y);
   }
}