package com.p1;

public class protection {
	
	int n=10;
	public int n_pub=20;
	protected int n_pro=30;
	private int n_pri=40;
	
	public protection() {
		System.out.println("Protection's Default Contructor");
		System.out.println("n : "+n);
		System.out.println("n : "+n_pub);
		System.out.println("n :" +n_pri);
	}
}
