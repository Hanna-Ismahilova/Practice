//Вычисление минимума из двух чисел
//Вот как это работает:
//public class MethodCall
//{
//   public static void main(String[] args)
//   {
//      int a = 5, b = 7;
//      int c = a, d = b;
//      int m2;
//      if (c < d)
//           m2 = c;
//      else
//           m2 = d;
//
//      int m = m2;
//      System.out.println("Minimum is "+ m);
//   }
//}

package com.mycompany.mavenproject1;

public class Task12 {
   public static void main(String[] args)
   {
      int a = 5, b = 7;
      int m = min(a, b);
      System.out.println("Minimum is "+ m);
   }

   public static int min(int c, int d)
   {
      int m2;
      if (c < d)
           m2 = c;
      else
           m2 = d;

      return m2;
   }
}
