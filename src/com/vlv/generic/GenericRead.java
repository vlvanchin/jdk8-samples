package com.vlv.generic;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Collection;

public class GenericRead {

	public <T, R> void reading(final T input) {
		final R result = (R) "abc";
	}

	public <T extends InputStream> void read(final T stream) {

	}

	
	public <T extends Serializable> void store(final T object) {

	}

	public <T extends InputStream & Serializable> void action (final T object) {
		
	}

	public <T extends InputStream & Serializable & Cloneable > void action_02 (final T object) {
		
	}
	
	public void action_03 (final Collection <? extends Serializable> object) {
		
	}

	public void action_04 (final Collection<?> object) {
		
	}
	
	public void interate (final Collection <? super Integer> object) {
		
	}
}
