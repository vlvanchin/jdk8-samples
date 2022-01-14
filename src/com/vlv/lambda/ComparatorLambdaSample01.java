package com.vlv.lambda;

import java.util.Comparator;

public class ComparatorLambdaSample01 {
	
	public static void main(String [] args) {
		
		// before java 8
		
		Comparator <Integer> comparator = new Comparator<Integer> () {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		
		System.out.println("result of comparator is " + comparator.compare(3, 2));
		System.out.println("result of comparator is " + comparator.compare(2, 2));
		System.out.println("result of comparator is " + comparator.compare(1, 2));
		
		Comparator<Integer> comparatorLambda = ( a ,  b) ->  a.compareTo(b);
		
		System.out.println("result of comparatorLambda is " + comparatorLambda.compare(3, 2));
		System.out.println("result of comparatorLambda is " + comparatorLambda.compare(2,2));
		System.out.println("result of comparatorLambda is " + comparatorLambda.compare(1,2));
	}
}
