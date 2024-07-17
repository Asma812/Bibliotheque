/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotheque.entities;

/**
 *
 * @author user
 */
public class Livres {
  private int id;
private String titre;

public Livres(int id, String titre) {
	this.id = id;
	this.titre = titre;
}

public Livres(String titre) {
	this.titre = titre;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getTitre() {
	return titre;
}

public void setTitre(String nom) {
	this.titre = titre;
}

@Override
public String toString() {
	return "Abonnés [id=" + id + ", titre=" + titre + "]";
}  
}
