package com.vlv.lambda;

public class LambdaSample01 {

  public static void main(String[] args) {

    // before java8
    Runnable runnable =
        new Runnable() {

          @Override
          public void run() {
            System.out.println("Inside runnalble 1");

          }
        };
        
     new Thread(runnable).start();
     
     
     /// in java 8
     Runnable runnable1 = () -> {
    	 System.out.println("Inside runnable 2");
     };
     
     new Thread (runnable1).start();
     
     // more simple lambda 
     
     Runnable runnable3 = () ->  System.out.println ("Inside runnable 3");
     new Thread(runnable3).start();
     
     // more simple
     
     new Thread (() -> System.out.println("inside runnable 4")).start();
  }
  
}
