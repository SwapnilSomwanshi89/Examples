package com.zcon.examples;

class Vehicle1{
	int x = 10;
	  void run(int a, float b){
	       
	       System.out.println("Vehicle1 is running"+a+"  B: "+b);}
	  }
	  class Vehicle extends Vehicle1{
	  void run(float b, int a,String ab){
	        
	       System.out.println("Vehicle is running"+a+"  B: "+b);}

	  public static void main(String args[]){
	  Vehicle obj = new Vehicle();
	  obj.run(10,50);
	  System.out.println(obj.x);
	  ////new comment
	  }
	}

