package com.java.AppforDocker.modele;


public class Personne {

	String nom;
    String message;

public Personne(String nom, String messgae) {
	super();
	this.nom = nom;
	this.message = messgae;
}

public Personne() {

}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}


	
}
