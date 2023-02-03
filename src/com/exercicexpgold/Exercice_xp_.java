package com.exercicexpgold;

public class Exercice_xp_ {
	
	String nom;
	int age;
	String chaine;
	char grade;
	
	
	// Constructeurs 
	
	
	public Exercice_xp_() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Exercice_xp_(String nom, int age, String chaine, char grade) {
		super();
		this.nom = nom;
		this.age = age;
		this.chaine = chaine;
		this.grade = grade;
	}



	
	public void displayStudentInfo() {

		System.out.println("nom " + this.nom + " age " + this.age + " chaine " + this.chaine + " grade " + this.grade );
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exercice_xp_ person = new Exercice_xp_("Dion", 24, "merci", 'A');
		person.displayStudentInfo();
	}
	
	

	


	

}
