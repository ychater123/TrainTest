package com.nespresso.exercises.train;

public class WagonC implements Wagon {
	private Boolean isFilled = false;
	
	@Override
	public String print() {
		if(isFilled) {
			return Consts.WAGON_C_FILLED;			
		}
		return Consts.WAGON_C_NOT_FILLED;
	}

	public Boolean getIsFilled() {
		return isFilled;
	}

	public void setIsFilled(Boolean isFilled) {
		this.isFilled = isFilled;
	}
}
