/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotheque.entities;

/**
 *
 * @author user
 */
public class Abonnés {
 		private int id;
		private String nom;
		private String prénom;

		public Abonnés(int id, String nom, String prénom) {
			this.id = id;
			this.nom = nom;
			this.prénom = prénom;
		}

		public Abonnés(String nom, String prénom) {
			this.nom = nom;
			this.prénom = prénom;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getPrénom() {
			return prénom;
		}

		public void setPrénom(String prénom) {
			this.prénom = prénom;
		}

		@Override
		public String toString() {
			return "Abonnés [id=" + id + ", nom=" + nom + ", prénom=" + prénom + "]";
		}
   
}
