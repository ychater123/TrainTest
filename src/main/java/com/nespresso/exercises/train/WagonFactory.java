package com.nespresso.exercises.train;

public class WagonFactory {
	private Boolean needsHead = true;
	
	public Wagon create(String wagonName) {
		switch (wagonName) {
		case "H":
			if(needsHead) {
				Wagon wagonH = new WagonH();
				((WagonH) wagonH).setHead(true);
				needsHead = false;
				return wagonH;
			}
			return new WagonH();
		case "P":
			return new WagonP();
		case "R":
			return new WagonR();
		case "C":
			return new WagonC();
		default:
			break;
		}
		return null;
	}
	
}
