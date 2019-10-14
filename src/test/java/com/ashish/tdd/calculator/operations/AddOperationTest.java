package com.ashish.tdd.calculator.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AddOperationTest {

	private AddOperation addOperation;
	
	@Before
	public void setUp() throws Exception {
		addOperation = new AddOperation();
	}

	@Test
	public void addOperation_whenInvokedWith_twoOrLess_csvOperands_returns_correct_result() {
		//arrange
		
		//act
		int add = addOperation.add("");
		
		//assert
		assertThat(add).isEqualTo(0);
	}

}
