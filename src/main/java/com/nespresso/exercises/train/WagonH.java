package com.nespresso.exercises.train;

public class WagonH implements Wagon {
	private boolean isHead = false;
	
	@Override
	public String print() {
		if(isHead) {
			return Consts.WAGON_H_HEAD;
		}
		else {
			return Consts.WAGON_H_END;
		}
	}

	public void setHead(boolean isHead) {
		this.isHead = isHead;
	}

}
