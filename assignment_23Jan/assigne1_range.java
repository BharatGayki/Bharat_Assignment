///Jai Shree Ram

import java.util.*;
class assigne1_range{
//Write a C program to compute the sum of the two given integers.
//If the sum is in the range 10..20 inclusive return 30
public static void main(String[] argu){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the first num");
int a = sc.nextInt();

System.out.println("Enter thr second num");
int b = sc.nextInt();

int res;

res = a+b;

if(res>=10&&res<=20){
	System.out.println("THE SUM IS "+res);
	System.out.println("30");

	}
else{

	System.out.println("THE SUM IS "+res);

	}
}// main function

}// class