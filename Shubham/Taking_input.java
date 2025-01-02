// Source code is decompiled from a .class file using FernFlower decompiler.
package Shubham;

import java.util.Scanner;

public class Taking_input {
   public Taking_input() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter age");
      int age = sc.nextInt();
      System.out.println("Age is:" + age);
      Scanner sc1 = new Scanner(System.in);
      System.out.println("Enter finals");
      float finals = sc1.nextFloat();
      System.out.println("finals is:" + finals);
      Scanner sc2 = new Scanner(System.in);
      System.out.println("Enter name");
      String name = sc2.next();
      System.out.println("name is:" + name);
      Scanner sc3 = new Scanner(System.in);
      System.out.println("Enter Sentence");
      String sentence = sc3.nextLine();
      System.out.println("Sentence is:" + sentence);
   }
}
