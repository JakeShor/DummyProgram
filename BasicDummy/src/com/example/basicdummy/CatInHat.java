package com.example.basicdummy;

public class CatInHat {

	CatsHat myHat;
	Grinch grinch;
	GreenEggsAndHam plate;
	Horton horton;
	
	public CatInHat(){
		this.tipHat();
		this.welcomeFriends();
		this.standTall();
	}
	
	public void tipHat(){
		myHat = new CatsHat();
	}
	
	public void welcomeFriends(){
		grinch = new Grinch();
		plate = new GreenEggsAndHam();
		horton = new Horton();
	}
	
	public void standTall(){
		
	}
}
