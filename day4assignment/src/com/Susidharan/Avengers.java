package com.Susidharan;
import java.util.Scanner;
public class Avengers {
    Scanner sc=new Scanner(System.in);
   public String name;
   public int age;
   public String power;
   public String weapon;
   public String planet;
  public void getdetails (){
       System.out.println("Enter the name : ");
       name=sc.nextLine();

      System.out.println("Enter the age: ");
      age=sc.nextInt();

      System.out.println("Enter the power: ");
      power=sc.nextLine();
      sc.nextLine();

      System.out.println("Enter the planet :");
      planet=sc.nextLine();

      System.out.println("Enter the weapon: ");
      weapon=sc.nextLine();


   }
   public void displaydetails(){
       System.out.println("The name is "+name+".");
       System.out.println("The age is "+age+".");
       System.out.println("the power is :"+power+".");
       System.out.println("The planet is :"+planet+".");
       System.out.println("The weapon is :"+weapon+".");

   }

}
