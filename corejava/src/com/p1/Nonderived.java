package com.p1;

public class Nonderived {
	
	public Nonderived() {
		protection p=new protection();
		System.out.println("NonDerived's Default Contructor");
		System.out.println("n_pub : "+p.n_pub);
		System.out.println("n_pro : "+p.n_pro);
		//System.out.println("n_pri :" +p.n_pri);
	}

}
