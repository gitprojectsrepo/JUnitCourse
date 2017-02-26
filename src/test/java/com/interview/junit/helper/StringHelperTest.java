package com.interview.junit.helper;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class StringHelperTest {

	@Test
	public void test() {
		//assertThat("thisbest", containsString("is"));
		assertThat(7, is(7));
		assertThat(7, is(equalTo(7)));
		assertThat(7, equalTo(7));
		assertThat(null, nullValue(null));
		//fail("Not yet implemented");
	}


	  @Test
	  public void testReverse() {
	    assertThat("oof", is(equalTo(StringHelper.reverseString("foo"))));
	    assertThat("rab", is(equalTo(StringHelper.reverseString("bar"))));
	    assertThat("!zaB", is(equalTo(StringHelper.reverseString("Baz!"))));
	  }
	  
	  @Test
	  public void testPalindromes() {
	    String[] matches = 
	      { "a", "aba", "Aba", "abba", "AbBa", "abcdeffedcba", "abcdEffedcba" };
	    String[] misMatches = 
	      { "ax", "axba", "Axba", "abbax", "xAbBa", "abcdeffedcdax", "axbcdEffedcda" };
	    for(String s: matches) {
	      assertThat(StringHelper.isPalindrome(s), is(true));
	    }
	    for(String s: misMatches) {
	      assertThat(StringHelper.isPalindrome(s), is(false));
	    }
	  }


}
