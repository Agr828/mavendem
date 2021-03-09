package com.demo.test;

import org.junit.Assert;
import org.junit.Test;

import com.demo.Calculator;

public class TestCalculator {
	@Test
	public void Shouldadd5positiveNums() {
	Calculator c=new Calculator();
	int sum=c.add(50,50,50,50,50);
	Assert.assertEquals(250, sum);
}
}
