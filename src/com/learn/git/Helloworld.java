package com.learn.git;

import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("welcome to git");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("your eligible to vote");
		}else {
			System.err.println("your not eligible to vote because your age is less than 18 years");
		}
		
		}

}
