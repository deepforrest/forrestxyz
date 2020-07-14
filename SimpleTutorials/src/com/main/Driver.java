package com.main;

public class Driver {

	//This is a comment. Notice how it does nothing when the code is compiled.
	//Comments are used to communicate to other programmers
	
	
	/*
	 * This is how you write a multi-line comment.
	 * This is another comment line in the same comment block
	 */
	
	
	/** 
	 * This is a method comment. Hover your mouse over the method name - sampleMethod()
	 * this comment should appear in method description now. This is whats called
	 * JavaDocs
	 * <p>
	 * We can also use enclosed HTML tags to write paragraphs and other cool things.
	 * Some common ones are @param, @return, @link
	 * Youll see a lot more as we go. 
	 * <p>
	 * These are used to describe your methods, but dont go too crazy as it can hurt the 
	 * code readability just as much as it can help.  
	 * The first line should be a brief description, followed by a paragraph that goes a bit more in
	 * depth. You can look at other methods for better examples.
	 */
	public void sampleMethod() {
		//This does nothing
	}
	
	
	/**
	 * This is your main method. Its where the magic starts for java.
	 * you may recall in python a similar method if name if __name__ == "__main__":
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Dont worry so much about String[] args
		 * This is a parameter but it since it is the main method we can leave it Null
		 * Normally this is not the case with other functions that require a parameter.
		 */
		
		//This is a function that takes a String and returns a String
		//System.out.printlin prints a string to the console
		System.out.println(sayHello("Forrest"));
		
		
		//Checkout this class for some brief data type stuff
		DataTypes.variables();
		DataTypes.Datatypes();

	}
	
	
	private static String sayHello(String text) {
		return "Hello " + text; 
	}

}
