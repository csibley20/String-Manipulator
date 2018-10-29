import java.util.Scanner;
/**
 * 
 * @author Connor Sibley
 * String Manipulator
 *
 */
public class StringManipulator 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Print a string:  ");
		String str = in.nextLine();
		
		int len = str.length();
		char first = str.charAt(0);
		char last = str.charAt(len-1);
		System.out.println("The String has a length of "+len);
		System.out.println("The first character of the string is "+first);
		System.out.println("The last character of the string is "+last);
		
		String half = str.substring(len/2);
		System.out.println(half+'\n');
		
		System.out.print("Select a letter:  ");
		String letter = in.nextLine();
		int index = str.indexOf(letter);
		System.out.println(letter+" appears at index "+index);
		
		System.out.print("Please enter a starting index:  ");
		String start = in.nextLine();
		int startInt = Integer.parseInt(start);
		System.out.print("Pleas enter an ending index:  ");
		String end = in.nextLine();
		int endInt = Integer.parseInt(end);
		String subStr = str.substring(startInt,endInt);
		System.out.println(subStr);

	}

}
