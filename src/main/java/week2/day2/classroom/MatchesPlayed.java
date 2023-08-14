package week2.day2.classroom;

import org.junit.Assert;
import org.junit.Test;

public class MatchesPlayed {
	/* 1) Did I understand the problem?  
	Description : To find the count of matches played
	* 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)?  int
	 *    What is the expected output?  int
	 *    Do I have constraints to solve the problem?
	 *    Do I have all informations to go to next step!!
	 *    
	 * 2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
	 *    7 -->6
	 *    14-->13
	 * 
	 * 3) Do I know how to solve it?
	 * 		Yes - great. 
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
 
	 * 5) Start always with Pseudo code 
       1.Get the input value
       2.while(n>1){ 
       if(n%2==0)
       n=n/2
       matches = matches+n;
       else{
           matches=(n-1/2);
           n=matches+1;
           
          }return matches
	 * }
	 * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 * 
	 */
	
	@Test
	 public void test() {
		 int actual=PlayedMatches(14);
		 Assert.assertEquals(13, actual);
	 }
	@Test
	 public void test1() {
		 int actual=PlayedMatches(7);
		 Assert.assertEquals(6, actual);
	 }
	public int PlayedMatches(int n) {
		int matchesplayed=0;
		while(n>1) {
			if(n%2==0) {
				n=n/2;
				matchesplayed = matchesplayed+n; 
			}else {
				n=(n-1)/2;
				matchesplayed=matchesplayed+n;
				matchesplayed=matchesplayed+1;
			}
		} 
		return matchesplayed;	
	}

}
