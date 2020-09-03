//DON'T UNCOMMENT THE FOLLOWING THREE LINES.
//[Student ID]
//[Student name] (as on eStudent)
//[] Declaration from student that they haven't viewed another person's code for this assignment. 
//(Add a x between the brackets)

package shopping;

public class StockItem {
	public String name;
	public double unitPrice;

	/**
	 * 
	 * @param str for name (assume not null)
	 * @param u for unitPrice
	 * 
	 * assign the upper case version of str to name 
	 * for this method, the only String functions allowed are length() and charAt(int).
	 * use of any other function will result in an automatic zero for this stage.
	 * assign the higher of 0 and u to unitPrice
	 * 
	 * for example, 
	 * 		if str = "Goal posts (1.5m)" and u = 259.9,
	 * 		name should become "GOAL POSTS (1.5M)" and unitPrice should become 259.9
	 */
	public StockItem(String str, double u) {
		String new_str = "";
		for(int i = 0; i < str.length(); i++) {
	                // If it is in lower-case 
	                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') { 
	  
	                    // Convert into Upper-case 
	                	new_str = new_str + (char)(str.charAt(i) - 'a' + 'A'); 
	                }  else {
	                	new_str = new_str + str.charAt(i);
	                	
	                }
			
		}
		name = new_str;
		unitPrice=u;
		System.out.println(name);
	}

	/**
	 * 
	 * @param percentageChange
	 * for example,
	 * 		if the unit price of the calling object is 1.2 before 
	 * 		the method is called with parameter 10, it should become
	 * 		1.32 after the method is called.
	 */
	public void updateRegularPrice(int percentageChange) {
		
	}

	/**
	 * @param other
	 * @return
	 * 1 if calling object is "more than" parameter object
	 * -1 if calling object is "less than" parameter object
	 * 0 if calling object is "equal to" parameter object
	 * 
	 * IMPORTANT!!! 
	 * Ordering criteria:
	 * first: unitPrice
	 * second: name (in lexicographic order - this is the standard ordering criteria for String compareTo)
	 * 
	 * For example 
	 * 		if calling object represents "BALL" with unit price 39.9
	 * 		and parameter object represents "BIBS" with unit price 5.9,
	 * 		return 1
	 * 
	 * 		if calling object represents "BIBS" with unit price 5.9
	 * 		and parameter object represents "BALL" with unit price 39.9,
	 * 		return -1
	 * 
	 * 		if calling object represents "BALL (SIZE 5)" with unit price 5.9
	 * 		and parameter object represents "BIBS" with unit price 5.9,
	 * 		return -1
	 * 
	 * 		if calling object represents "BIBS" with unit price 5.9
	 * 		and parameter object represents "BALL (SIZE 5)" with unit price 5.9,
	 * 		return 1
	 * 
	 * 		if calling object represents "BALL" with unit price 5.9,
	 * 		and parameter object represents "BIBS (XL)" with unit price 5.9
	 * 		return -1
	 * 
	 * 		if calling object represents "BIBS (XL)" with unit price 5.9
	 * 		and parameter object represents "BALL" with unit price 5.9,
	 * 		return 1
	 * 
	 * 		if calling object represents "BIBS (XL)" with unit price 5.9
	 * 		and parameter object represents "BIBS" with unit price 5.9,
	 * 		return 1
	 * 
	 * 		if calling object represents "BIBS" with unit price 5.9
	 * 		and parameter object represents "BIBS" with unit price 5.9,
	 * 		return 0
	 */
	public int compareTo(StockItem other) {
		return 0;
	}
}
