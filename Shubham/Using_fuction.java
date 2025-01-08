package Shubham;

import java.util.Scanner;
public class Using_fuction {
    public static void Name(String name){
        System.out.println(name);
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();
        Name(name);
    }
}
