package com.externalprog;

import java.util.Scanner;

public class StrikerateofBatter {
	static double calculatStrikerate(double runs, double balls) {
		if(runs == 0 && balls == 1) {
			return -1;
		}else if(runs ==0 || balls == 0) {
			return -2;
		}
		else {
			double sr = runs/balls*100;
			return sr;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter how many runs scored by the batter: ");
		double runs = sc.nextDouble();
		
		System.out.println("Enter how many balls faced by the batter: ");
		double balls = sc.nextDouble();
		
		double sr = calculatStrikerate(runs, balls);
	
		if(sr == -1) {
			System.out.println("Batter got duck out, and Strike rate is: 0.00");
		}else if(sr == -2) {
			System.out.println("Batter did'nt come to bat.");
		}else {
			System.out.println("Strike rate of the batter is: "+sr);
		}
	}
}
