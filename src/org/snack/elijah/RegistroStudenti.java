package org.snack.elijah;

public class RegistroStudenti {
	private Studente [] registro;
	
	public RegistroStudenti(int numeroStudenti) {
		registro = new Studente[numeroStudenti];
	}
	
	public void addStudente(Studente studente) {
		for(int i = 0; i < registro.length; i++) {
			if(registro[i] == null) {
				registro[i] = studente;
				break;
			}
		}
	}
	
	public void showStudenteListOnConsole() {
		for(Studente reg: registro) {
			String returnString = reg != null ? "" + reg.getNome() + " " + reg.getCognome() + " | classe " + reg.getClasse() + " | anni " + reg.getAnni() : "Studente non presente";
			System.out.println(returnString);
		}
	}

}
