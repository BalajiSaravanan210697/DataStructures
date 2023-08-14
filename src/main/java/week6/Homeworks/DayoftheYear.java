package week6.Homeworks;

import org.junit.Assert;
import org.junit.Test;

public class DayoftheYear {
	/*
	 * Problem No : 1154. Day of the Year Easy 378 438 Companies Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD,
	 * return the day number of the year.
	 * 
	 * Example 1:
	 * Input: date = "2019-01-09" --> Output: 9
	 * Explanation: Given date is the 9th day of the year in 2019. 
	 
	 * Example 2:
	 * Input: date = "2019-02-10" --> Output: 41
	 * 
	 * Constraints:
	 * 
	 * date.length == 10 
	 * date[4] == date[7] == '-', and all other date[i]'s are digits 
	 * date represents a calendar date between Jan 1st, 1900 and Dec 31th, 2019.
	 */
	/* 1) Did I understand the problem?  
	Description : To find the Days count in the particular year based on the given input string 
	* 		-> If yes, go to next step !! Yes
	 * 
	 *    What is the input(s)?  String
	 *    What is the expected output? int 
	 *    Do I have constraints to solve the problem? 
	 > date.length == 10
     >date[4] == date[7] == '-', and all other date[i]'s are digits
     >date represents a calendar date between Jan 1st, 1900 and Dec 31th, 2019.
	 
	 *    Do I have all informations to go to next step!! Yes
	 *    
	 * 2) Test data set
	 *    Minimum of 3 data set !! Positive, Edge, Negative 
	 *    Positive : 2019-01-09  --> 9
	                 2016-02-29  --> 60
					 2012-03-01  --> 61
					 2012-04-01  --> 92
					 1995-12-01 --> 335
					 
	 *    Edge :     2019-12-31 --> 365
	                 1990-01-01 --> 1
					 2010-08-09 --> 221
	 *    Negative : 201008-09 --> expected 'date' to have 10 <= size <= 10 but got 9
	                 1899-12-31 --> expected 'year' to have value from 1900 to 2019 only
					 
	  
	 * 3) Do I know how to solve it? Yes
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	  > create a integer array and store the respective month days in the array with order
      > Get the input String and coverted to integer and store into respective values like Year,Month,Date
      > using if condition to check the given year is leap year or not  year%4==0 then increase the day+1 and check that month also greater than 2
	  > create a while loop to check that month>0
	      yes then add the day = day+days[month-1]
		  return the day 
		  after each iteration decrement the days--
     * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 */
	
	/*****Positive*****/
	 @Test
	 public void positivetest() {
	 int actual = dayNumberofyear("2012-04-01");
	 Assert.assertEquals(92, actual); }
	 @Test
	 public void positivetest1() {
	 int actual = dayNumberofyear("2016-02-29");
	 Assert.assertEquals(60, actual); }
	 @Test
	 public void positivetest2() {
	 int actual = dayNumberofyear("2012-03-01");
	 Assert.assertEquals(61, actual); }
	 @Test
	 public void positivetest3() {
	 int actual = dayNumberofyear("1900-05-02");
	 Assert.assertEquals(123, actual); }
	 /*****Edge*****/
	 @Test
	 public void Edgetest() {
	 int actual = dayNumberofyear("2019-12-31");
	 Assert.assertEquals(365, actual); }
	 @Test
	 public void Edgetest1() {
	 int actual = dayNumberofyear("1990-01-01");
	 Assert.assertEquals(1, actual); }
	 @Test
	 public void Edgetest2() {
	 int actual = dayNumberofyear("2010-08-09");
	 Assert.assertEquals(221, actual); }
	 @Test
	 public void Edgetest3() {
	 int actual = dayNumberofyear("2012-12-31");
	 Assert.assertEquals(366, actual); }
	
	 /*****Negative*****/
	 @Test
	 public void Negativecase1() {
		 dayNumberofyear("1899-12-19");
		 }
	 @Test
	 public void Negativecase2() {
		 dayNumberofyear("2020-12-19");
		 }
	 public int dayNumberofyear(String date){
		 int[] days = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};    //2012-04-01
		             //0  1   2   3   4   5   6   7   8   9   10  11  12 
		 int year = Integer.parseInt(date.substring(0,4));  //return year in integer  2012
		 int month = Integer.parseInt(date.substring(5,7)); //return month in integer  04
		 int day = Integer.parseInt(date.substring(8));    //return date in integer   01 +1 ==>2 
		 if(year<1900||year>2019) {throw new RuntimeException("expected 'year' to have value from 1900 to 2019 only");}
		 if(year%4==0&&month>2&& (year % 100 != 0 || year % 400 == 0)){  //Leap Year and input greater than one than adding one extra day
		   day++;
		 }
		 while(month>0){            //month == 4 4>0 3>0  2>0 1>0
		 day=day+days[month-1]; 
		 month --; //  day = 2+days[3] --> 2+30 ==> 32 --> 32+31 --> 63 ==> 63+28 --> 91 -> 91+31 --> 
		 }                //  3  2 1  0
		 return day;          
		 }

}
