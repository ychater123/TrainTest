package com.nespresso.exercises.train;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Train {
	List<Wagon> wagons = new ArrayList<Wagon>();
	WagonFactory wf = new WagonFactory();
	
	public Train(String structure) {
		for (String wagon : structure.split("")) {
			wagons.add(wf.create(wagon));
		}
	}

	public String print(){
		StringBuilder trainSchema = new StringBuilder();
		
		for (Iterator<Wagon> iterator = wagons.iterator(); iterator.hasNext();) {
			Wagon wagon = (Wagon) iterator.next();
			trainSchema.append(wagon.print());
			if(iterator.hasNext()) trainSchema.append(Consts.SEPARATOR);
		}
		
		return trainSchema.toString();
	}

	public void detachEnd(){
		if(!wagons.isEmpty()) {
			Wagon lastWagon = wagons.get(wagons.size() -1);
			if(lastWagon instanceof WagonH) wagons.remove(wagons.size() -1);
		}
	}

	public void detachHead(){
		if(!wagons.isEmpty()) {
			Wagon lastWagon = wagons.get(0);
			if(lastWagon instanceof WagonH) wagons.remove(0);
		}
	}

	public boolean fill() {
        Boolean isFilled = false;
        for (Wagon wagon : wagons) {
			if((wagon instanceof WagonC) && !((WagonC) wagon).getIsFilled()) {
				((WagonC) wagon).setIsFilled(true);
				break;
			}
		}
        return isFilled;
	}
}
