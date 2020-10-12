package com.Susidharan;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        int dob,mob,by,ms;
        System.out.println("Enter the Employee name. ");
        name=sc.nextLine();
        System.out.println("The Employee name is "+ name+".");
        System.out.println("Enter the Date of Birth : ");
        dob=sc.nextInt();
        System.out.println("Enter the Month of Birth : ");
        mob=sc.nextInt();
        System.out.println("Enter the Birth Year : ");
        by=sc.nextInt();

        int cy,ca;
        cy=2020;
        ca=(2020-by);
        System.out.println("The current age of the employee is "+ca+".");

        double tax;
        int as;
        System.out.println("Enter the Monthly Salary: ");
        ms=sc.nextInt();
        as=ms*12;
        if(as>=500000){
            tax=(as*0.20);
            System.out.println("The Annual Salary is : "+as+"INR.");
            System.out.println("The Annual Tax amount is "+tax+"INR.");
        }
        else if(as>=400000){
            tax=(as*0.15);
            System.out.println("The Annual Salary is : "+as+"INR.");
            System.out.println("The Annual Tax amount is "+tax+"INR.");
        }
        else if(as>=300000){
            tax=(as*0.10);
            System.out.println("The Annual Salary is : "+as+"INR.");
            System.out.println("The Annual Tax amount is "+tax+"INR.");
        }
        else if(as>=200000){
            tax=(as*0.05);
            System.out.println("The Annual Salary is : "+as+"INR.");
            System.out.println("The Annual Tax amount is "+tax+"INR.");
        }




    }
    }
