package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleListTest {

	@Test
	void testSimpleList() {
		SimpleList list = new SimpleList();
		//Checks if the value is not null
		assertNotNull(list);
	}

	@Test
	void testSimpleListFail() {
		SimpleList list = new SimpleList();
		//Failing a test case, saying that the value is not null
		assertNotEquals(list, null);
	}

	@Test
	void testAdd() {
		// Fills the array
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(44);
		//Uses the toString to check if the values in order
		String result = list.toString();
		assertEquals("44 10 9 8 7 6 5 4 3 2", result);
	}

	@Test
	void testAddFail() {
		SimpleList list = new SimpleList();
		/*Fills the array, says that once the array is full
		no more entries should be allowed */
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(44);
		//toString to check false statement
		String result = list.toString();
		assertNotEquals("10 9 8 7 6 5 4 3 2 1", result);
	}

	@Test
	void testRemove() {
		SimpleList list = new SimpleList();
		//Fills array then removes element
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.remove(7);
		//Checks to see if it was removed properly
		String result = list.toString();
		assertEquals("10 9 8 6 5 4 3 2 1", result);

	}

	@Test
	void testRemoveFail() {
		SimpleList list = new SimpleList();
		//Removes element, but does not update the count
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.remove(7);
		//toString to check the incorrect result
		String result = list.toString();
		assertNotEquals("10 9 8 6 5 4 3 2 1 1", result);

	}

	@Test
	void testCount() {
		SimpleList list = new SimpleList();
		//Adds elements to check count
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		//Checks the count w/ expected value
		int size = list.count();
		assertEquals(7,size);
	}

	@Test
	void testCountFail() {
		SimpleList list = new SimpleList();
		//Adding past the array length
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		//Says the count should be the amount of elements added
		int size = list.count();
		assertNotEquals(12,size);
	}

	@Test
	void testToString() {
		SimpleList list = new SimpleList();
		//Simple toString test to get a correct value
		list.add(5);
		String result = list.toString();
		assertEquals("5", result);
	}

	@Test
	void testToStringFail() {
		SimpleList list = new SimpleList();
		//Adds to the list
		list.add(5);
		list.add(4);
		//Would print in reverse order which is false
		String result = list.toString();
		assertNotEquals("4 5 ", result);
	}

	@Test
	void testSearch() {
		SimpleList list = new SimpleList();
		//Searches for the value and returns the index
		list.add(5);
		list.add(3);
		list.add(2);
		int resultIndex = list.search(5);
		assertEquals(2,resultIndex);
	}

	@Test
	void testSearchFail() {
		SimpleList list = new SimpleList();
		/* Fail case where it got the last index not the first one
		while iterating */
		list.add(3);
		list.add(3);
		list.add(1);
		int resultIndex = list.search(5);
		assertNotEquals(2,resultIndex);
	}
}
