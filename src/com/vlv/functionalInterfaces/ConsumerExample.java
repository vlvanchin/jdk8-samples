package com.vlv.functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import com.vlv.data.Student;
import com.vlv.data.StudentDataBase;

public class ConsumerExample {

  public static void main(String[] args) {
    Consumer<String> consumer = (a) -> System.out.println(a.toUpperCase());
    consumer.accept("van");
    printAllStudents();
    printNameAndActivities();
    printNameAndActivities2();
    printNameAndActivitiesUsingConditions();
  }

  public static void printAllStudents() {
    Consumer<Student> consumer2 = (student) -> System.out.println(student);
    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(consumer2);
  }
  
  public static void printNameAndActivities () {
	  System.out.println("printNameAndActivities : ");
	  Consumer<Student> consumeStudentList = (student) -> {
		  System.out.println("Name: " + student.getName());
		  System.out.println("Activites: " + student.getActivities());
	  };
	  List<Student> allStudents = StudentDataBase.getAllStudents();
	  allStudents.forEach(consumeStudentList);
	  
  }
  
  public static void printNameAndActivities2 () {
	  System.out.println("printNameAndActivities2 : ");
	  List<Student> allStudents = StudentDataBase.getAllStudents();
	  allStudents.forEach(consumeStudentName.andThen(consumeStudentActivities));
	  
  }
  
  public static void printNameAndActivitiesUsingConditions () {
	  
	  System.out.println("printNameAndActivitiesUsingConditions : ");
	  List<Student> allStudents = StudentDataBase.getAllStudents();
	  allStudents.forEach((student -> {
		if (student.getGradeLevel() >= 3) {
			consumeStudentName.andThen(consumeStudentActivities).accept(student);
		}
	  }));
	  
  }
  
  static Consumer<Student> consumeStudentName = (student) ->   System.out.print("Name: " + student.getName());
  static Consumer<Student> consumeStudentActivities = (student) -> System.out.println("Activites: " + student.getActivities());
}
