package com.acme.todolist.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Test;

class TodoItemTest {

	@Test
	void isLateItem() {
		TodoItem item = new TodoItem("1",Instant.now().minus(2, ChronoUnit.DAYS),"");
		boolean expected = true;
		boolean result = item.isLate();
		assertEquals(expected,result);
	}
	
	@Test
	void isLateItem2() {
		TodoItem item = new TodoItem("1",Instant.now().minus(5, ChronoUnit.HOURS),"");
		boolean expected = false;
		boolean result = item.isLate();
		assertEquals(expected,result);
	}
	
	@Test
	void isLateItem3() {
		TodoItem item = new TodoItem("1",Instant.now(),"");
		boolean expected = false;
		boolean result = item.isLate();
		assertEquals(expected,result);
	}

}

