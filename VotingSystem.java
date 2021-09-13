package com.xworkz.controlStatements;

public class VotingSystem {

	public static void main(String[] args) {
		byte age=23;
		String nationality="Indian";
		if(age>=18 && nationality=="Indian") {
			System.out.println("Eligible for vote");
		}else {
			System.out.println("Not eligible for vote");
		}
	}

}
