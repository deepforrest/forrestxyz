package com.main;

/**
 * Class that covers some examples of Variables and DataTypes
 */
public class DataTypes {

	private DataTypes() {}
	
	/**
	 * {@link #DataTypes}
	 */
	public static void variables() {
		int i; //This is how to declare a variable
		i = 0; //This is how to set a varaible to a value
		System.out.println("I == " + i);
		
		//You can also reassign a variable once its declared 
		i = 1;
		System.out.println("I == " + i);
		
	}
	
	public static void Datatypes() {
		/*
		 * There are 8 primitive data types:
		 * 1) byte - Stores 1 byte 
		 * 2) char - Stores 2 bytes (unicode char range)
		 * 3) short - Stores 2 bytes (−32768 to 32767)
		 * 4) int - Stores 4 bytes (-2,147,483,648 .. 2,147,483,647)
		 * 5) long - Stores 8 bytes (-9,223,372,036,854,775,808 .. 9,223,372,036,854,775,807)
		 * 6) float - Stores 4 bytes (3.40282347 x 1038, 1.40239846 x 10-45) NOTE: used often with money$$
		 * 7) double - Stores 8 bytes (1.7976931348623157 x 10308, 4.9406564584124654 x 10-324) Largest numeric range
		 * 8) boolean - Stores True/False values
		 */
	
		//Notice how they are all lower case. There are upper case variants which are used when Casting
		int i = 100;
		double d = i;
		System.out.println("Notice that an int can be cast up to a double: " + d);
		System.out.println("You cannot do the reverse since doubles are much larger than int" );
		//You can use Casting to convert from larger data types to smaller but data will be lost
		int ii = (int) d; //Notice that you need to include the data type in (). This will usually cost data tho
		System.out.println("Expect some data loss here: " +  ii);
		
		//You can also use the upper case version such as Double or Integer to parse numbers from strings
		//In addition you must use these when passing as an argument/parameter to a collections (we'll get there)
		String num = "100";
		Integer iNum = Integer.parseInt(num);
		System.out.println("iNum converted the string num into an Integer: " + iNum);
		
		//Strings are a bit different in that they are not primitive. They are acutally a list of chars
		String s = "This is not a primitive but a sequence of characters stored in an array";
		System.out.println(s);
		
		//There is a lot more on this topic and I encourage you to explore it by practicing with conversions 
	}
}
