package com.vlv.generic;

import java.io.Serializable;

public class Sample02 {
	
	public static void main (String [] args) {
		
		Sample_02 inst01 = new Sample_02();
		Sample_02 modifiedInst = (Sample_02)performAction(inst01);
		System.out.println("modified object " + modifiedInst);
		
		final Sample_02 inst03 = new Sample_02();
		final Sample_02 modifiedIns02 = performAction02(inst03);
		System.out.println("modified object " + modifiedIns02);
				
		
	}
	
	// before java 8
	public static Serializable performAction (final Serializable param1) {
		return param1;	
	}
	
	// java 8 and after
	public static <T extends Serializable > T performAction02 (final T param1) {
		return param1;
	}
	
}



class Sample_02 implements Serializable  {
	
}