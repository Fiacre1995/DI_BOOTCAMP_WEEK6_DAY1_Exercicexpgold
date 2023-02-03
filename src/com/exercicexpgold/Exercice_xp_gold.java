package com.exercicexpgold;

public class Exercice_xp_gold {

	double rayon;
	
	//Constructeur sans parametre
	
	public Exercice_xp_gold() {
		super();
		
		this.rayon = 1;
	}

	
	//Constructeur avec parametre
	
	public Exercice_xp_gold(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	public double Aire() {
		
		return rayon * rayon;
		
	}
	
	public static void main(String[] args) {
		
		Exercice_xp_gold rayon1 = new Exercice_xp_gold(2.0);
		Exercice_xp_gold rayon2 = new Exercice_xp_gold(12);
		Exercice_xp_gold rayon3 = new Exercice_xp_gold(14);
		
		System.out.println(rayon1.Aire());
		System.out.println(rayon2.Aire());
		System.out.println(rayon3.Aire());
		
		
		Exercice_xp_gold rayon4 = new Exercice_xp_gold();
		System.out.println(rayon4.Aire());
		
	}


	

	
	

	
}
