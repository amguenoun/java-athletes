package com.lambdaschool.solution;

public class BaseballCourtInjector implements CourtInjector {
	@Override
	public Processor getProcess() {
		return new MyApplication( new BaseballCourtCreator());
	}
}
