package week3.day1.classworks;

import org.junit.Test;

import junit.framework.Assert;

public class StringReverse {
@Test
public void test() {
	String actual=reverseofString("Balaji Saravanan");
	Assert.assertEquals("nanavaraS ijalaB", actual);
	
}
	public String reverseofString(String str) {
     String rev="";
     for (int i =str.length()-1; i >=0;  i--) {
		rev=rev+str.charAt(i);
		
	}System.out.println(rev);
		return rev;
		}
	
}
