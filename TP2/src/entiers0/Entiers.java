package entiers0;

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
	
	public Entiers(int [] entiers) {
		this.entiers = entiers;
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
		/*String c = "[";
		for(int i=0; i<tab.length; i++) {
			c = "" + this.tab[i];
		}
		c = c + "]";
		return(c);*/
		String s = "[";
		for (int n : entiers) {
			s+= n + " ";
		}
		s+="]";
		return s;
	}
	
}
