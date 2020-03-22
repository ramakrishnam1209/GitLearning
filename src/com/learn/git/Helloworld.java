package com.learn.git;

import java.util.Arrays;
import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("welcome to git");
		
        int[] arr= {1,3,5,7,9,11};
        int[] arr2= new int[arr.length];
        int increment=0;
        System.out.println("Before "+Arrays.toString(arr));
        for(int i=arr.length-1;i>=0;i--) {
        	arr2[increment]=arr[i];
        	increment++;
        }

        System.out.println("After "+Arrays.toString(arr2));
		
		}

}
