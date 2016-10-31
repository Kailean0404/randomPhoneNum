//**********************************|
//Author: Kailean Hunter      		|
//File Name: Project2         		|
//Project: Phone Number Generator	|
//Date: 9/12/16		          		|
//**********************************|
import java.util.Random;										//import random generator

public class randomPhoneNum {
	public static void main (String [] args){
		
		Random generator = new Random();						//random number generator
		int num1, num2, num3, num4, num5;						// num1, 2, and 3 are first 3 digits

		num1 = generator.nextInt(8);						//random num between 0 and 7
		System.out.print(num1);		
		
		num2 = generator.nextInt(8);						//same 
		System.out.print(num2);
		
		num3 = generator.nextInt(8);						//same
		System.out.print(num3);
		
		num4 = generator.nextInt(644) + 99;					//random num between 100 and 743
		System.out.print("-"+ num4);
		
		num5 = generator.nextInt(9001) + 999;					//random num between 1000 and 9999
		System.out.print("-"+ num5);
		
}

}
