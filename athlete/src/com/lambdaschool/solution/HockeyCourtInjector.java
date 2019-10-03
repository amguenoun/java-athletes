package com.lambdaschool.solution;

public class HockeyCourtInjector implements CourtInjector {
	@Override
	public Processor getProcess() {
		return new MyApplication( new HockeyCourtCreator());
	}
}
