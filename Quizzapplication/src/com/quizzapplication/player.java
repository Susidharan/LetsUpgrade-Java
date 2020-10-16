package com.quizzapplication;
import java.util.Scanner;
public class player {
    String name;
    int score=0;
    Scanner sc=new Scanner(System.in);
    public void getDetails(){
        System.out.println("Enter player name");
        name=sc.next();

    }
}
