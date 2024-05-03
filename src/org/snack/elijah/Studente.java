package org.snack.elijah;

public class Studente {
	private String nome, cognome, classe;
	private int anni;
	
	public Studente(String nome, String cognome, String classe, int anni) {
		this.nome = nome;
		this.cognome = cognome;
		this.classe = classe;
		this.anni = anni;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public int getAnni() {
		return anni;
	}

	public void setAnni(int anni) {
		this.anni = anni;
	}
	
	
}
