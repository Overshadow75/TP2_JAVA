package entiers1bis;

public class Entiers {
	public static final int TAILLE = 5;
	
	private final int [] entiers;
	private int index;

	public Entiers() {
		entiers = new int [TAILLE];
	}
	
	// VIOLATION DU PRINCIPE D'ENCAPSULATION
	// car affectation de références
	// si le tableau passé en paramètres est modifié
	// dans le contexte de l'appelant (ici le main de TestEntiers)
	// alors celui de la classe Entiers aussi
	// RECIPROQUEMENT 
	// si le tableau de la classe Entiers est modifié
	// alors le tableau passé en paramètres est modifié
	// dans le contexte de l'appelant (ici le main de TestEntiers)
	// RESUME : aucune étanchéité entre les classes Entiers et TestEntiers
	public Entiers(int [] entiers) {
		//this.entiers = entiers;
		this.entiers = new int[TAILLE];
		for(int i=0; i<TAILLE; i++) {
			this.entiers[i] = entiers[i];
		}
		this.entiers[TAILLE-1] = 666;
	}
	
	// attention au débordement dans un tableau statique
	public void add(final int n) {
		if (index < 0 || index > TAILLE) {
			return;
		}
		
		entiers[index] = n;
		index++;
	}
	
	@Override
	public String toString() {
		String s = ("[ ");
		for (int n : entiers) {
			s += n + " ";
		}
		s += "]";
		return s;
	}
}
	
	
