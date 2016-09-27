import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
import java.util.Scanner;


public class missingNo {

    public static void main(String[] args){

        ArrayList<Integer> oneToTen = new ArrayList<Integer>(10);
	ArrayList<Integer> copyOneToTen = new ArrayList<Integer>(10);
	Scanner scr = new Scanner(System.in);

	String strgNo;
	Integer random;
		System.out.print("Enter 1st number  ");
		random = scr.nextInt();
		oneToTen.add(0,random);
		System.out.print("Enter 2nd number  ");
		random = scr.nextInt();
		oneToTen.add(1,random);
		System.out.print("Enter 3rd number  ");
		random = scr.nextInt();
		oneToTen.add(2,random);
		System.out.print("Enter 4th number  ");
		random = scr.nextInt();
		oneToTen.add(3,random);
		System.out.print("Enter 5th number  ");
		random = scr.nextInt();
		oneToTen.add(4,random);		
		System.out.print("Enter 6th number  ");
		random = scr.nextInt();
		oneToTen.add(5,random);
		System.out.print("Enter 7th number  ");
		random = scr.nextInt();
		oneToTen.add(6,random);
		System.out.print("Enter 8th number  ");
		random = scr.nextInt();
		oneToTen.add(7,random);
		System.out.print("Enter 9th number  ");
		random = scr.nextInt();
		oneToTen.add(8,random);
		System.out.print("Enter 10th number  ");
		random = scr.nextInt();
		oneToTen.add(9,random);
	
	System.out.println(oneToTen);
	copyOneToTen.addAll(oneToTen);
	System.out.println();
	// System.out.println("Copylist : " + copyOneToTen);
		
		System.out.println("Enter the number you want to remove:  ");
		random = scr.nextInt();

		for (Integer i : copyOneToTen)
		{
			if (oneToTen.contains(random))
			{
			oneToTen.remove(random);
			System.out.println("Number " + random + " is removed");
			} 
			else{
			    } //END of if 
		} //END of for loop
		System.out.println(oneToTen);

	for (Integer j : copyOneToTen)
	{

		if (oneToTen.contains(j))
		{	
		} 
		else{
			System.out.println("Number " + j + " is missing");
		    } //END of if 
	 } //END of For loop
	} // END of Main
} //END of Class missingNo






