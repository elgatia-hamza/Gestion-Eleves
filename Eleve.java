package gestionsEleves;

import java.util.ArrayList;

public class Eleve {
	private String nom;
	private ArrayList<Integer> listeNotes;
	private double moyenne = 0;
	
	public Eleve(String nom) {
		this.nom = nom;
		this.listeNotes = new ArrayList<Integer>();
	}
	
	

	@Override
	public String toString() {
		return this.nom +" ( "+this.moyenne+" ) ";
	}



	public String getNom() {
		return nom;
	}

	public ArrayList<Integer> getListeNotes() {
		return listeNotes;
	}
	
	public double getMoyenne() {
		return moyenne;
	}
	
	
	public void ajouterNote(int note) {
		int nbPoint = listeNotes.size();
		if(note <= 0) {
			note = 0;
		}
		
		if(note >= 20) {
			note = 20;
		}
		
		this.listeNotes.add(note);
		
		moyenne = (moyenne*nbPoint + note)/(nbPoint + 1);
		
	}
	

}
