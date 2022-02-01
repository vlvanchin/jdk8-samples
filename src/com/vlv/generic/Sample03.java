package com.vlv.generic;

import java.io.Serializable;

public class Sample03 {

	public static void main (String[] args) {
		
		Sample03 obj1 = new Sample03();
		obj1.performAction(new InnerClassImpl());
	}
	
	public void performAction(final InnerClassImpl obj) {
		obj.run();
		System.out.println("in the action method");
	}
}

class InnerClassImpl implements InnerClass01 {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void run( ) {
		System.out.println("running in innerclassimpl");
	}
}


interface InnerClass01 extends Serializable, Runnable {
	public void run() ;
}


