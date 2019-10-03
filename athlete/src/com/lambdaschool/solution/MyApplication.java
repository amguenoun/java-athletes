package com.lambdaschool.solution;

public class MyApplication implements Processor {

	private AthleteCreator myAth;
	private CourtCreator myCrt;

	public MyApplication(AthleteCreator myAth) {
		this.myAth = myAth;
	}

	public MyApplication(CourtCreator myCrt){
		this.myCrt = myCrt;
	}

	@Override
	public void displayAthlete() {
		System.out.println("\n************");
		myAth.printAthlete();
		System.out.println("************\n");
	}

	@Override
	public void displayCourt() {
		System.out.println("\n************");
		myCrt.printCourt();
		System.out.println("************\n");
	}
}
