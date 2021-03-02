package entiers2;

public class Entiers {
	public static final int TAILLE = 5;

	private int [] entiers;
	
	private int index = 0;
	
	/*for (int i=0; i<tab.length; i++) {
		if(tab[i] == NULL) {
			index = 1; 
		}
	}*/
	

	public Entiers(){
		entiers = new int[TAILLE];
		index = 0;
	}
	// Pas de violation du principe d'encapsulation
	// grace à la copie defensive (copie de la reference)
	public Entiers(int [] entiers) {
		//this.entiers = entiers;
		this.entiers = new int[TAILLE];
		/*for(int i=0; i<TAILLE; i++) {
			if(this.entiers[i] == 0) {
				entiers[i] = null;
			}
		}*/ // à résoudre
		this.entiers[TAILLE-1] = 666;
	}
	
	public void add(final int n) {
		if(index<0 || index >= TAILLE) {
			return;
		}
		entiers[index] = n;
		index++;
	}
	
	@Override
	public String toString() {
		String s = "[";
		for (int n : entiers) {
			s+= n + " ";
		}
		s+="]";
		return s;
	}
}
