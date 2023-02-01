// Jai Shree Ram

// Write a C program to check if it is possible to add two integers to get the third integer from three given integers.

import java.util.*;

class operation{

public void  operation(){

System.out.println("Hello All");

Scanner cs = new Scanner(System.in);

System.out.println("Eneter the 1st num");
int a = cs.nextInt();

System.out.println("Eneter the 2nd num");
int b = cs.nextInt();

System.out.println("Eneter the 3rd num");
int d = cs.nextInt();

int res1,res2,res3;

if(a+b==d){

System.out.println("The given condition is satisfied "+a+" + "+d+" = "+b+" ");
	}
else if(b+d==a) {

	System.out.println("The given condition is satisfied "+b+" + "+d+" = "+a+" ");

	}
else if(a+d==b){

		System.out.println("The given condition is satisfied");

	}
else {

	System.out.println("The given condition does not satisfied "+a+" + "+d+" = "+b+" ");

	}

}


}

class assign_6{

public static void main(String [] argu){


System.out.println("Jai Bajrang Bali");

operation ob = new operation();

ob.operation();

}





}