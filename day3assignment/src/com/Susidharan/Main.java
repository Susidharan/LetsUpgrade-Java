package com.Susidharan;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int sub1,sub2,sub3,sub4,sub5;
        double tp;


        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the five subjects marks");
        sub1=sc.nextInt();
        System.out.println(sub1);
        if(sub1>90&&sub1<100){
            System.out.println("The grade is 'S'.");
        }
        else if(sub1>80&&sub1<=90){
            System.out.println("The grade is 'A'.");
        }else if(sub1>70&&sub1<=80){
            System.out.println("The grade is 'B'.");
        }else if(sub1>60&&sub1<=70){
            System.out.println("The grade is 'C'.");
        }
        sub2=sc.nextInt();
        System.out.println(sub2);
        if(sub2>90&&sub2<100){
            System.out.println("The grade is 'S'.");
        }
        else if(sub2>80&&sub2<=90){
            System.out.println("The grade is 'A'.");
        }else if(sub2>70&&sub2<=80){
            System.out.println("The grade is 'B'.");
        }else if(sub2>60&&sub2<=70){
            System.out.println("The grade is 'C'.");
        }
        sub3=sc.nextInt();
        System.out.println(sub3);
        if(sub3>90&&sub3<100){
            System.out.println("The grade is 'S'.");
        }
        else if(sub3>80&&sub3<=90){
            System.out.println("The grade is 'A'.");
        }else if(sub3>70&&sub3<=80){
            System.out.println("The grade is 'B'.");
        }else if(sub3>60&&sub3<=70){
            System.out.println("The grade is 'C'.");
        }
        sub4=sc.nextInt();
        System.out.println(sub4);
        if(sub4>90&&sub4<100){
            System.out.println("The grade is 'S'.");
        }
        else if(sub4>80&&sub4<=90){
            System.out.println("The grade is 'A'.");
        }else if(sub4>70&&sub4<=80){
            System.out.println("The grade is 'B'.");
        }else if(sub4>60&&sub4<=70){
            System.out.println("The grade is 'C'.");
        }
        sub5=sc.nextInt();
        System.out.println(sub5);
        if(sub5>90&&sub5<100){
            System.out.println("The grade is 'S'.");
        }
        else if(sub5>80&&sub5<=90){
            System.out.println("The grade is 'A'.");
        }else if(sub5>70&&sub5<=80){
            System.out.println("The grade is 'B'.");
        }else if(sub5>60&&sub5<=70){
            System.out.println("The grade is 'C'.");
        }

        tp=(sub1+sub2+sub3+sub4+sub5)*0.2;
        ;
        System.out.println("Total percentage is "+tp+"%");






    }
}
