public class StringExample {
    
    public static void main(String[] args) {
		
		// uninitialized string
		String uninitialized;
		// initialized string
		String initialized = "initialized"; // literal
		
		// print to console the value of the string
		System.out.println(initialized); // initialized
		
		// store value representing how many characters in the string
		int length = initialized.length();
		// print to console the number of characters
        System.out.println(length); // 11
		
		// compare if the string matches another (O(1) best, O(n) worst)
		boolean matchesUninitialized = initialized.equals("uninitialized");
		// print to console result if strings match or not
        System.out.println(matchesUninitialized); // false
		
		String anotherInitializedString = new String("initialized");
		// compare if the objects (by memory) are the same
		boolean equalsOperatorResult = (initialized == anotherInitializedString);
		// print to console result if memory location is the same
        System.out.println(equalsOperatorResult); // false
		
		// compare if the strings match (based on memory and content)
		boolean equalsMethodResult = initialized.equals(anotherInitializedString);
		// print to console result if the memory or content match
        System.out.println(equalsMethodResult); // true
		
		String shallowCopyOfInitialized = initialized;
		// compare if the string match based on memory (equals operator)
		boolean equalsOperatorResultOfShallowCopy = (initialized == shallowCopyOfInitialized);
		// print to console result if memory location is the same
        System.out.println(equalsOperatorResultOfShallowCopy); // true
		
		// compare if the strings match (based on memory and content)
		equalsMethodResult = initialized.equals(shallowCopyOfInitialized); // re-assign value of equalsMethodResult
		// print to console result if the memory or content match
        System.out.println(equalsMethodResult); // true
		
		// check if a string contains a substring (O(nm))
		System.out.println(initialized.contains("ed")); // true
		
		// create a substring from a string from index 0, ending at index (exclusive, doens't include char at last index) (O(n))
		System.out.println(initialized.substring(0, 4));
		
		String replaceExample = "Hello World";
		replaceExample = replaceExample.replace("World", "User");
		// replace instances of one character with another (O(n))
		System.out.println(replaceExample); // Hello User
		
		
		
		
	}
}