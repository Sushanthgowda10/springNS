package com.nit.comps;

public final class PEngine implements Engine {

	public PEngine() {
		System.out.println("PEngine:: 0-param constructor");
	}

	@Override
	public String Model(int mNo) {
		return "Model Number of PEngine is- " + mNo;
	}

	@Override
	public String toString() {
		return "PEngine";
	}

}
