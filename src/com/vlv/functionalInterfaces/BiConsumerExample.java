package com.vlv.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import com.vlv.data.Student;
import com.vlv.data.StudentDataBase;

public class BiConsumerExample {
	
	public static void printStudentNameAndActivities () {
		BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
			System.out.println(name + " : " + activities);
		};
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		studentList.forEach((student -> {
			biConsumer.accept(student.getName(), student.getActivities());
		}));
	}
	
	public static void main (String[] args) {

		BiConsumer<String,String> biConsumer = (a, b) -> System.out.println("a: " + a + ", b: " + b);
		
		biConsumer.accept("java7", "java8");
		
		BiConsumer<Integer, Integer> multiply = (m, n) -> System.out.println("Multiplication of m * n : " + (m*n));
		
		multiply.accept(5, 10);
		
		printStudentNameAndActivities();
	}
}
