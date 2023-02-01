///  Jai Shree Ram

import java.util.*;


class palindrome_trial{

public static void main(String [] argu){

Scanner sc = new Scanner(System.in);




System.out.println("Enter the name :");
String str= sc.nextLine();

String ob = new String(str);

ob.reverse();

//String data = ob.toString();// to store object into another string variable

String b = ob;

System.out.println(ob);



if(str.equals(b)){

	System.out.println("is a palindrome");

	}

else{

	System.out.println("Not a palindrome ");

	}







}


}