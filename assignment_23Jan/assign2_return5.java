// Jai Shree Ram

import java.util.*;
class assign2_return5{

//Write a C program that accept two integers and return true
//if either one is 5 or their sum or difference is 5

public static void main(String [] argu){

Scanner sc = new Scanner(System.in);

System.out.println("enter thE NUM ");
int a = sc.nextInt();

System.out.println("Enter the second num");
int b = sc.nextInt();

int res1, res2;

res1 = a+b;
res2 = a-b;
if(a>b){

res1 = a+b;
res2 = a-b;
if(res1==5||res2=5){

	System.out.println("Return value is 30");
	}

}


}