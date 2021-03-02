package entiers0;

public class TestEntiers {
	
	public static void afficher(int [] entiers) {
		if(entiers == null) {
			return;
		}
		String s = "[";
		for (int n : entiers) {
			s+= n + " ";
		}
		s+="]";
		System.out.println(s);
	}
	
	public static void main(String [] arg) {
		
	Entiers entiers1 = new Entiers();

	entiers1.add(1);
	entiers1.add(2);
	entiers1.add(3); 
	System.out.println("entiers1 : " + entiers1);

	int tab [] = new int[Entiers.TAILLE]; 
	tab[0] = 20;
	tab[1] = 30;
	tab[2] = 40; 
	System.out.print("tableau : "); 
	afficher(tab);
	Entiers entiers2 = new Entiers(tab); 
	System.out.println("entiers2 : " + entiers2);
	System.out.println("Modification de l'élément " + tab[1] + " d'index 1 du tableau"); 
	tab[1] = -1;
	System.out.print("tableau : "); 
	afficher(tab);
	System.out.println("entiers2 : " + entiers2);
	}
	
}
