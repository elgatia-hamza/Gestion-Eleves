package gestionsEleves;

public class TestGroupeEleves {

	public static void main(String[] args) {
		Eleve e1 = new Eleve("Karim");
		Eleve e2 = new Eleve("Sara");
		e2.ajouterNote(20);
		Eleve e3 = new Eleve("Soufia");
		GroupeEleves g = new GroupeEleves();
		g.ajouterEleve(e1);
		g.ajouterEleve(e2);
		g.ajouterEleve(e3);
		g.lister();

	}

}
