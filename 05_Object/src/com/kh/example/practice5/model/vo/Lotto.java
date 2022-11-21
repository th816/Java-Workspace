package com.kh.example.practice5.model.vo;

import java.util.Arrays;

public class Lotto {
	
	private int[] lotto = new int[6];
	{
		
		for(int i =0; i<lotto.length;i++) {
			int random = (int)(Math.random()*45+1);
			lotto[i] = random;
			for(int j=0; j<i; j++) {
				if(lotto[j]==random) {
					i--;
					break;
				}
				
			 
			}
			
		}
		
	}
	
	
	
	
	
	public Lotto() {
		super();
	}
	
	
	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	
	}
	
	public int[] getLotto() {
		
		return lotto;
	}
	
	public void information() {
		
		System.out.println(Arrays.toString(lotto));
	}
	
	

}
