package com.nit.comps;

public class EEngine implements Engine{
	public EEngine() {
		System.out.println("PEngine:: 0-param constructor");
	}

	@Override
	public String Model(int mNo) {
		return "Model Number of EEngine is- "+ mNo ;
	}

	@Override
	public String toString() {
		return "EEngine";
	}
	
	

}
