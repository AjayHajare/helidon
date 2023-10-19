package com.arithmetic.addition;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MultiplicationBLogic {
	public int exceute(int a, int b) {
		System.out.println(" MultiplicationBLogic.execute "+a +", "+b);
		return a * b;
	}
}
