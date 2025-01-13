package com.externalprog;

import java.util.Scanner;

public class AverageofBatsman {
	public static int calculateAverage(int runs, int ins, int  notouts) {
		if(ins == 0) {
			return -1;
		}else {
			int avg = runs/(ins-notouts);
			return avg;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the total no.of runs scored by the batter: ");
		int runs = sc.nextInt();
		
		System.out.println("Enter total innings He/She played: ");
		int ins = sc.nextInt();
		
		System.out.println("How many times the Batter remains not out: ");
		int notouts = sc.nextInt();
		
		int avg = calculateAverage(runs, ins, notouts);
		
		if(avg == -1) {
			System.out.println("Sorry the batter did'nt bat yet, and the average is: 0.0");
		}else {
		System.out.println("Average of the Batter is: "+avg);
		}
	}
}
