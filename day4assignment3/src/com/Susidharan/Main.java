package com.Susidharan;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] num=new int[5];
	int result;

	num[0]=sc.nextInt();
	num[1]=sc.nextInt();
	num[2]=sc.nextInt();
	num[3]=sc.nextInt();
	num[4]=sc.nextInt();

	result=num[0]+num[1]+num[2]+num[3]+num[4];

        System.out.println(result);
    }
}
