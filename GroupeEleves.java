package gestionsEleves;

import java.util.ArrayList;

public class GroupeEleves {
	private ArrayList<Eleve> listeEleves;
	
	public GroupeEleves() {
		super();
		this.listeEleves = new ArrayList<Eleve>();
	}
	
	public int nombre() {
		return listeEleves.size();
	}
	
	public ArrayList<Eleve> getListe(){
		return listeEleves;
	}
	
	public void ajouterEleve(Eleve eleve) {
		this.listeEleves.add(eleve);
	}
	
	public Eleve chercher(Eleve eleve) {
		for(Eleve e :listeEleves) {
			if(e.getNom().equals(eleve.getNom())) {
				return e;
			}
		}
		return null;
	}
	
	public void lister() {
		System.out.println("La  liste des eleves dans ce groupe est : ");
		for(Eleve e:listeEleves) {
			System.out.println("\t- "+e);
		}
	}

}
