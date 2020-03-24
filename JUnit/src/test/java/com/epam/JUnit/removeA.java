package com.epam.JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class removeA {
	RemoveAs removeAs=new RemoveAs();

	@Test
	void removeSingleA() {
		assertEquals("BCD",removeAs.remAs("ABCD")); 
		assertEquals("BCD",removeAs.remAs("BACD"));
		assertEquals("",removeAs.remAs("A"));
	}
	@Test
	void removeDoubleA() {
		assertEquals("CD",removeAs.remAs("AACD"));
	}
	@Test
	void noRemoval() {
		assertEquals("BCD",removeAs.remAs("BCD"));
		assertEquals("BCAD",removeAs.remAs("BCAD"));
	}
	@Test
	void emptyString() {
		assertEquals(null,removeAs.remAs(""));
	}

}
