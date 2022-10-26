package com.cours.test.junit;

public class Calculator {
	public int soustractio(int c, int d) {
		return 0;
	}

	public void longueCalcul() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int addTwoNumber(int i, int j) {
		// TODO Auto-generated method stub
		return i + j;
	}

	public int multiplyTwoNumber(int c, int d) {
		return c * d;
	}

}
