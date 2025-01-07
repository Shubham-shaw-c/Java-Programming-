package Shubham;

import java.util.Scanner;

public class Floyds_triangle {
   public Floyds_triangle() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the rows");
      int a = sc.nextInt();
      int b = 1;

      for(int i = 1; i <= a; ++i) {
         for(int j = 1; j <= i; ++j) {
            int var10001 = b++;
            System.out.print("" + var10001 + " ");
         }

         System.out.println();
      }

   }
}
