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
		myAth.printAthlete();
	}

	@Override
	public void displayCourt() {
		myCrt.printCourt();
	}
}
