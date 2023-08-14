package week3.day1.Homeworks;
import org.junit.Assert;
import org.junit.Test;
public class MergeStringd {
	/* 1) Did I understand the problem?  
	Description : To Merge the give input strings
	* 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)? String
	 *    What is the expected output? String
	 *    Do I have constraints to solve the problem?
	 *    Do I have all informations to go to next step!!
	 *    
	 * 2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
          word1 = "abc", word2 = "pqr"  -->"apbqcr"
	 * 3) Do I know how to solve it?
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	 * 1.Get the String input values
	 * 2.Get the length of the given string values
	 * 3.if word1.length ==word2.length
	 * 4.Create a for loop to iterate the values
	 * 5.temp to add the values from charAt Word1(i)+ charAt Word2(i) 
       6.else if word1 < word2 
       7.for loop iterate the values
       8.temp to add the values from charAt Word1(i)+ charAt Word2(i) +  append the remain values of word2
       9.else word1>word2
       10.for loop iterate the values
       11.temp to add the values from charAt Word1(i)+ charAt Word2(i) +  append the remain values of word1
	 
	 * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 */
	@Test
	public void test() {
		String actual=finalMergedString("abc","pqr");
		Assert.assertEquals("apbqcr", actual);
	}
	@Test
	public void test1() {
		String actual=finalMergedString("ab","pqrs");
		Assert.assertEquals("apbqrs", actual);
	}
	@Test
	public void test2() {
		String actual=finalMergedString("abcd","pq");
		Assert.assertEquals("apbqcd", actual);
	}
	
	public String finalMergedString(String str1,String str2) {
		String temp="";
		int length1=str1.length();
		int length2=str2.length();
		if(length1==length2) {
			for (int i = 0; i < str1.length(); i++) {
				temp=temp+str1.charAt(i)+str2.charAt(i);
			}
			
		}
		else if(length1<length2){
			for (int i = 0; i < str1.length(); i++) {
				temp=temp+str1.charAt(i)+str2.charAt(i);
			}temp=temp+str2.substring(length1, length2);
			
		}
		else if(length1>length2){
			for (int i = 0; i < str2.length(); i++) {
				temp=temp+str1.charAt(i)+str2.charAt(i);
			}temp=temp+str1.substring(length2, length1);
			
		}
		return temp;
		
	}
}
