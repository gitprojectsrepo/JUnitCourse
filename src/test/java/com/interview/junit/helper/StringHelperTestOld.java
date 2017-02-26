package com.interview.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTestOld {

	  @Test
	  public void testReverse() {
	    assertEquals("oof", StringHelper.reverseString("foo"));
	    assertEquals("rab", StringHelper.reverseString("bar"));
	    assertEquals("!zaB", StringHelper.reverseString("Baz!"));
	  }
	  
	  @Test
	  public void testPalindromes() {
	    String[] matches = 
	      { "a", "aba", "Aba", "abba", "AbBa", "abcdeffedcba", "abcdEffedcba" };
	    String[] misMatches = 
	      { "ax", "axba", "Axba", "abbax", "xAbBa", "abcdeffedcdax", "axbcdEffedcda" };
	    for(String s: matches) {
	      assertTrue(StringHelper.isPalindrome(s));
	    }
	    for(String s: misMatches) {
	      assertFalse(StringHelper.isPalindrome(s));
	    }
	  }

}
