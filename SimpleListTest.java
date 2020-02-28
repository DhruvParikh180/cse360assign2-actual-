package cse360assign2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleListTest {

	@Test
	void testSimpleList() {
		SimpleList l = new SimpleList();
		//Checks if the value is not null
		assertNotNull(l);
	}

	@Test
	void testSimpleListF() {
		SimpleList l = new SimpleList();
		//Fing a test case, saying that the value is not null
		assertNotEquals(l, null);
	}

	@Test
	void testAdd() {
		// Fills the array
		SimpleList l = new SimpleList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		l.add(44);
		//Uses the toString to check if the values in order
		String result = l.toString();
		assertEquals("44 10 9 8 7 6 5 4 3 2", result);
	}

	@Test
	void testAddF() {
		SimpleList l = new SimpleList();
		/*Fills the array, says that once the array is full
		no more entries should be allowed */
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		l.add(44);
		//toString to check false statement
		String result = l.toString();
		assertNotEquals("10 9 8 7 6 5 4 3 2 1", result);
	}

	@Test
	void testRemove() {
		SimpleList l = new SimpleList();
		//Fills array then removes element
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		l.remove(7);
		//Checks to see if it was removed properly
		String result = l.toString();
		assertEquals("10 9 8 6 5 4 3 2 1", result);

	}

	@Test
	void testRemoveF() {
		SimpleList l = new SimpleList();
		//Removes element, but does not update the count
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		l.remove(7);
		//toString to check the incorrect result
		String result = l.toString();
		assertNotEquals("10 9 8 6 5 4 3 2 1 1", result);

	}

	@Test
	void testCount() {
		SimpleList l = new SimpleList();
		//Adds elements to check count
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		//Checks the count w/ expected value
		int size = l.count();
		assertEquals(7,size);
	}

	@Test
	void testCountF() {
		SimpleList l = new SimpleList();
		//Adding past the array length
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		l.add(11);
		l.add(12);
		//Says the count should be the amount of elements added
		int size = l.count();
		assertNotEquals(12,size);
	}

	@Test
	void testToString() {
		SimpleList l = new SimpleList();
		//Simple toString test to get a correct value
		l.add(5);
		String result = l.toString();
		assertEquals("5", result);
	}

	@Test
	void testToStringF() {
		SimpleList l = new SimpleList();
		//Adds to the l
		l.add(5);
		l.add(4);
		//Would print in reverse order which is false
		String result = l.toString();
		assertNotEquals("4 5 ", result);
	}

	@Test
	void testSearch() {
		SimpleList l = new SimpleList();
		//Searches for the value and returns the index
		l.add(5);
		l.add(3);
		l.add(2);
		int resultIndex = l.search(5);
		assertEquals(2,resultIndex);
	}

	@Test
	void testSearchF() {
		SimpleList l = new SimpleList();
		/* F case where it got the last index not the first one
		while iterating */
		l.add(3);
		l.add(3);
		l.add(1);
		int resultIndex = l.search(5);
		assertNotEquals(2,resultIndex);
	}

	@Test
	void testAppend() {
		// Fills the array
		SimpleList l = new SimpleList();
		l.add(1);
		l.append(2);
		l.append(3);
		l.append(4);
		l.append(5);
		l.append(6);
		l.append(7);
		l.append(8);
		l.append(9);
		l.append(10);
		l.append(44);
		//Uses the toString to check if the values in order
		String result = l.toString();
		assertEquals("44 10 9 8 7 6 5 4 3 2", result);
	}

	@Test
	void testAppendF() {
		SimpleList l = new SimpleList();
		/*Fills the array, says that once the array is full
		no more entries should be allowed */
		l.add(1);
		l.append(2);
		l.append(3);
		l.append(4);
		l.append(5);
		l.append(6);
		l.append(7);
		l.append(8);
		l.append(9);
		l.append(10);
		l.append(44);
		//toString to check false statement
		String result = l.toString();
		assertNotEquals("10 9 8 7 6 5 4 3 2 1", result);
	}

	@Test
	void testSize() {
		SimpleList l = new SimpleList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		l.add(44);
		int result = l.size();
		assertNotEquals(this.l.length, result);
	}

	@Test
	void testSizeF() {
		SimpleList l = new SimpleList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		l.add(44);
		int result = l.size();
		assertNotEquals(this.l.length, result);
	}

	@Test
	void testFirst() {
		SimpleList l = new SimpleList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		l.add(44);
		int result = l.first();
		assertNotEquals(0, result);
	}

	@Test
	void testFirstF() {
		SimpleList l = new SimpleList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		l.add(44);
		int result = l.first();
		assertNotEquals(0, result);
	}

	@Test
	void testLast() {
		SimpleList l = new SimpleList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		l.add(44);
		int result = l.last();
		assertNotEquals(0, result);
	}

	@Test
	void testLastF() {
		SimpleList l = new SimpleList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		l.add(44);
		int result = l.last();
		assertNotEquals(0, result);
	}

}
