package com.quizzapplication;
import java.util.Scanner;
public class Question {
    Scanner sc=new Scanner(System.in);

    String question,op1,op2,op3,op4;
    int crctans,userans;


    public boolean askQuestion(){
        System.out.println(question);
        System.out.println("1. "+op1);
        System.out.println("2. "+op2);
        System.out.println("3. "+op3);
        System.out.println("4. "+op4);
        System.out.println("Please choose an option");
        userans=sc.nextInt();
         if(userans==crctans){
            return true;
         }
            return false;
    }
}
