package com.lambdaschool.solution;

public class MyApplication implements Processor {

	private AthleteCreator myAth;

	public MyApplication(AthleteCreator myAth) {
		this.myAth = myAth;
	}

	@Override
	public void displayAthlete() {
		myAth.printAthlete();
	}
}
