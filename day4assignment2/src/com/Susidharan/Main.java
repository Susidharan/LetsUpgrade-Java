package com.Susidharan;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	     int[] num=new int[5];

	     num[0]=sc.nextInt();
	     num[1]=sc.nextInt();
	     num[2]=sc.nextInt();
         num[3]=sc.nextInt();
         num[4]=sc.nextInt();

         if(num[0] % 2==1){
             System.out.println(num[0]);
         }
         if(num[1]%2==1){
            System.out.println(num[1]);
        }
         if(num[2]%2==1){
             System.out.println(num[2]);
         }
         if(num[3]%2==1){
             System.out.println(num[3]);
         }

         if(num[4]%2==1){
             System.out.println(num[4]);
         }
    }
}
