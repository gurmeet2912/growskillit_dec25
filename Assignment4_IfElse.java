1. Question 1: Smallest of Two Numbers

package assignment_4;

public class Program1_twonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method 
   int a = 10;
   int b =20;
  if(a < b) {
	  System.out.println("Smallest number:" + a);
  }else {
	  System.out.println("Smallest number:" + b);
  }

	}

}


2. Question 2: Greatest of Three Numbers

package assignment_4;

public class Program2_GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = 30;
		if(a>=b && a>=c) {
			System.out.println("Greatest Number is " + a);
		}else if(b>=a && b>=c) {
			System.out.println("Greatest Number is " + b);
			
		}else {
			System.out.println("Greatest Number is " + c);
		}

	}

}

3. Question 3: Grading System

package assignment_4;

public class Program3_GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method 
 int marks = 72;
 if(marks>=90 && marks<=100) {
	 System.out.println("Grade is " + "A");
	 
 }if(marks>=75 && marks<=89) {
	 System.out.println("Grade is " + "B");
	 
 }if(marks>=50 && marks<=74) {
 System.out.println("Grade is " + "C");
 }else {
	 System.out.println("Fail"); 
 }
 

	}
