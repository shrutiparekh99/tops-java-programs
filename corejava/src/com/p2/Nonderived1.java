package com.p2;

import com.p1.protection;

public class Nonderived1 {
	
	public Nonderived1() {
		protection p=new protection();
		System.out.println("Nonderived's Default Contructor");
		//System.out.println("n : "+p.n);
		System.out.println("n_pub : "+p.n_pub);
		System.out.println("n_pro :" +p.n_pub);
		//System.out.println("n_pri :" +p.n_pri);
	}
}
