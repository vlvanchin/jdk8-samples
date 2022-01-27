package com.vlv.generic;

import java.util.Collection;

public class GenericMethods <T> {

	public <R> R performAction (final T input) {
		final R result = (R) "";
		
		return result;
	}
	
	public <U, R> R performActionOn (final U input) {
		final R result = (R) "";
		
		return result;
	}
	
	public GenericMethods (final T initialAction) {
		
	}
	
	public <J> GenericMethods (final T initialAction, final J nextAction) {
		
	}
	
	void sort( Collection< String > strings ) {
	// Some implementation over strings heres
	}
	
	// this fails as the signature is same as above
	void sort ( Collection < Number> numbers ) {
		// do some thing here
	}
	
	// the following method fails the compilation when used with instanceof 
	public <T> void action_01(final T action) {
		if (action instanceof T) {
			// Do something here
		}
	}

	public< T > void action_02( final T action ) {
		if( T.class.isAssignableFrom( Number.class ) {
		// Do something here
		}
	}
	
	// cannot create a generic arrya of T
	public< T > void performAction_01( final T action ) {
		T[] actions = new T[ 0 ];
	}

}
