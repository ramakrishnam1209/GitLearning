package com.git.learn;

import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {

		int[] series=new int[20];
		series[0]=0;
		series[1]=1;
		
		for(int i=2;i<series.length;i++){
			series[i]=series[i-2]+series[i-1];
		}
		
		
		System.out.println(Arrays.toString(series));
	}

}
