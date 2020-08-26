package gestionsEleves;

public class TestEleve {

	public static void main(String[] args) {
		Eleve s = new Eleve("Sophie");
		s.ajouterNote(12);
		s.ajouterNote(16);
		s.ajouterNote(20);
		System.out.println(s);
	}

}
