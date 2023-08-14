package week3.day2.ClassWorks;

import org.junit.Assert;
import org.junit.Test;

public class NumberofSeniorCitizens {
	/*
	 * 1) Did I understand the problem? Description : To get the count of people
	 * with age greater than 60 -> If yes, go to next step !!
	 * 
	 * What is the input(s)? String[] What is the expected output? int Do I have
	 * constraints to solve the problem? Do I have all informations to go to next
	 * step!!
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Input: details =
	 * ["7868190130M7522","5303914400F9211","9273338290F4010"]--> Output: 2 Input:
	 * details = ["1313579440F2036","2921522980M5644"]-->Output: 0
	 * 
	 * 3) Do I know how to solve it? Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 1.Get the input string[] arrays 2.Iterate
	 * using for loop the array index values 3.Get the value of present in the index
	 * 11 and 12 and concatinate 4.if the value is greater than 60 then increase the
	 * count 4. return count 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set
	 * 
	 * 8) If it fails, debug them to solve it !!
	 */
	@Test
	public void test() {
		int actual = toGettheoldpassengers(new String[] { "7868190130M7522", "5303914400F9211", "9273338290F4010" });
		Assert.assertEquals(2, actual);
	}

	@Test
	public void test1() {
		int actual = toGettheoldpassengers(new String[] { "1313579440F2036", "2921522980M5644" });
		Assert.assertEquals(0, actual);
	}

	public int toGettheoldpassengers(String[] details) {
		/*
		 * int count=0; //int age=""; for (int i = 0; i < details.length; i++) {
		 * 
		 * age = details[i].subSequence(11, 13); age = Integer.parseInt((String) age);
		 * 
		 * break; }if(age>60) { count++; } return count;
		 */
		return 9;
	}

}
