package com.nit.comps;

public final class DEngine implements Engine {

	public DEngine() {
		System.out.println("DEngine:: 0-param constructor");
	}

	@Override
	public String Model(int mNo) {
		return "Model Number of DEngine is- " + mNo;
	}

	@Override
	public String toString() {
		return "DEngine ";
	}
	
}