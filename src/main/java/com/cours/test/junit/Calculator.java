package com.cours.test.junit;

import java.util.LinkedHashSet;
import java.util.Set;

public class Calculator {
	public int soustractio(int c, int d) {
		return 0;
	}

	public Set<Integer> verifierOrdreChifffre(Integer in) {
		String sIn = String.valueOf(in);
		Set<Integer> result = new LinkedHashSet<Integer>();
		for (int i = 0; i < sIn.length(); i++) {
			result.add(Integer.valueOf(Integer.parseInt(sIn, i, i + 1, 10)));
		}
		return result;
	}

	public void longueCalcul() {
		try {
			Thread.sleep(500);
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

	public int divide(int i, int j) {
		// TODO Auto-generated method stub
		return i / j;
	}

}
