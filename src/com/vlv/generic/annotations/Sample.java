package com.vlv.generic.annotations;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Sample {

	public <@Actionable T extends Serializable > void action(final T action) {
		
	}
	
	public final Collection<@NotEmpty T> strings = new ArrayList<>(); 
	

}
