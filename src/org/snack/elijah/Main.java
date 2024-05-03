package org.snack.elijah;

public class Main {

	public static void main(String[] args) {
		RegistroStudenti registro = new RegistroStudenti(5);
		
		Studente studente1 = new Studente("Marco", "Rossi", "1E", 22);
		Studente studente2 = new Studente("Fabio", "Pallo", "1E", 25);
		Studente studente3 = new Studente("Giuseppe", "Pedullà", "1E", 35);
		Studente studente4 = new Studente("Gabriele", "Tosto", "1E", 23);
		
		registro.addStudente(studente1);
		registro.addStudente(studente2);
		registro.addStudente(studente3);
		registro.addStudente(studente4);
		
		registro.showStudenteListOnConsole();
		

	}

}
