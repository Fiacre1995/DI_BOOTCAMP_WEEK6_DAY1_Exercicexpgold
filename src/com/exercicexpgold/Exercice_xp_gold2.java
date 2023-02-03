package com.exercicexpgold;

public class Exercice_xp_gold2 {
	
	//Attributs 
	
	String make;
	String model;
	int year;
	String color;
	double price;
	
	//Constructeur sans parametre 
	
	public Exercice_xp_gold2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Constructeur avec parametre
	
	public Exercice_xp_gold2(String make, String model, int year, String color, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
	}
	
	public void displayInfo() {
		
		System.out.println("marque " + this.make + " modele " + this.model + " Year " + this.year + " Couleur " + this.color + " price " + this.price);
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exercice_xp_gold2 voiture = new  Exercice_xp_gold2("Mercedes", "c100", 2020, "red", 200);
		voiture.displayInfo()

	}

	
	

}
