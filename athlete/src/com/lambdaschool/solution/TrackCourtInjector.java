package com.lambdaschool.solution;

public class TrackCourtInjector implements CourtInjector {
	@Override
	public Processor getProcess() {
		return new MyApplication( new TrackCourtCreator());
	}
}
