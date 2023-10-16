package com.cours.test.junit;

import java.util.LinkedHashSet;
//TEST PUSFHH SERVEUR 
import java.util.Set;
//commentaire 14h38 SERVEUR
//ligne 1514 commit 1
//ligne 1514 commit 2VIENDUFITAVECCONFLICT
public class Calculator {
	//line 2020 local
	//masterbranche 2121
	//masterbranche 2222VAFAIREDECONFLI
	public int soustractio(int c, int d) {
		////A REFRESHIR EN LOCAL AVANT PUSH
		return 0;
	}

	public Set<Integer> verifierOrdreChifffre(Integer in) {
		///JAI MODIE LOCAL AVANT FRESH REMOTE ET REBASE
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
	public void faisrisssen(){
		System.out.println(
			"Line CommitA");
	}
	public void featurecalulator2Rajout(){
		System.out.println(
			"Calculator2rajout");
	}
}
