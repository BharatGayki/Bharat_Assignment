// jai shree ram

import java.util.*;

class assigne9_checkNUm{
/*

Write a Java program to find the larger from two given integers. However if the two integers have the same remainder when divided by 5,
then the return the smaller integer. If the two integers are the same, return 0.

*/
public static void main(String [] argu){


Scanner sc = new Scanner(System.in);

System.out.println("Ente the first num");
int a =  sc.nextInt();


System.out.println("Ente the Second num");
int b =  sc.nextInt();

int res1,res2;


res1 = a%5;


res2 = b%5;
int gr,sm;

if(a<b){

	gr = b;

	}
//else{


//	sm = a;
	//}

System.out.println("Greater is "+gr);

//System.out.println("Smaller is "+sm);




}

}
