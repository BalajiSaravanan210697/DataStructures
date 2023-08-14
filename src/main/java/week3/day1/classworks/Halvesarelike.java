package week3.day1.classworks;

import org.junit.Assert;
import org.junit.Test;

public class Halvesarelike {
	/* 1) Did I understand the problem?  
	Description : To find the given input string halves equal or not
	* 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)?  String 
	 *    What is the expected output?  boolean
	 *    Do I have constraints to solve the problem?
	 *    Do I have all informations to go to next step!!
	 *    
	 * 2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
           book --> true
           textbook--> false
	 * 3) Do I know how to solve it?
     	Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	 * 1.Get the input string and get the length and divide by 2
	 * 2.splitting the string using substring method
	 * 3.char array to store the vowels
	 * 4.for loop to iterate the splitter string character
	 * 5. A nested for loop to compare the string value with vowel array
	 * 6. if the value of char array and vowel matches 
	 *    Increase the count
     * 7.for loop to iterate the splitter string character
	 * 8. A nested for loop to compare the string value with vowel array
	 * 9. if the value of char array and vowel matches 
	 *    Increase the count
	  10. return true if the count is equal
	 *    

	 * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 * 
	 */
	@Test
	public void test() {
		boolean actual=twoHalvesorEqualornot("Book");
		Assert.assertEquals(true, actual);
	}
	@Test
	public void test1() {
		boolean actual=twoHalvesorEqualornot("textbook");
		Assert.assertEquals(false, actual);
	}
	public int twoHalvesorEqualornotMethod(String s) {
	    	int count=0;
	    	char[] vowels= {'a','e','i','o','u','A','E','I','O','U'};
	    	for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < vowels.length; j++) {
					if(s.charAt(i)==vowels[j]) {
						count++;
					}
				}
			}
	    	return count;
	    }
	
	public boolean twoHalvesorEqualornot(String str) {
		int length = str.length()/2;
		String str1=str.substring(0,length);
		String str2=str.substring(length,str.length());
		int count1=twoHalvesorEqualornotMethod(str1);
		int count2=twoHalvesorEqualornotMethod(str2);
		return count1==count2;
	}
}
