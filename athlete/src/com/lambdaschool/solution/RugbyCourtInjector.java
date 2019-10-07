package com.lambdaschool.solution;

public class RugbyCourtInjector implements CourtInjector {
	@Override
	public Processor getProcess() {
		return new MyApplication( new RugbyCourtCreator());
	}
}
