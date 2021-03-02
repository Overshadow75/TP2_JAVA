package entiers1bis;

public class TestEntiers {

	public static void afficher(int [] tab) {
		if (tab == null) {
			return;
		}
		
		System.out.print("[ ");
		for (int n : tab) {
			System.out.print(n + " ");
		}
		System.out.println("]");
	}
	
	public static void main (String [] arg) {
		Entiers entiers1 = new Entiers();

		entiers1.add(1);
		entiers1.add(2);
		entiers1.add(3);
		System.out.println("entiers1 : " + entiers1);
	
		int tab [] = new int[Entiers.TAILLE];
		tab[0] = 20;
		tab[1] = 30;
		tab[2] = 40;
		System.out.print("tableau :  ");
		afficher(tab);
		
		Entiers entiers2 = new Entiers(tab);
		System.out.println("entiers2 : " + entiers2); 
		
		System.out.println("Modification de l'élément " + tab[1] + " d'index 1 du tableau");
		tab[1] = -1;
		
		System.out.print("tableau :  ");
		afficher(tab);
		System.out.println("entiers2 : " + entiers2); 
	}
}

/**
EXECUTION SANS COPIE DEFENSIVE
IL Y A VIOLATION DU PRINCIPE D'ENCAPSULATION

entiers1 : [ 1 2 3 0 0 ]
tableau :  [ 20 30 40 0 0 ]
entiers2 : [ 20 30 40 0 666 ]
Modification de l'élément 30 d'index 1 du tableau
tableau :  [ 20 -1 40 0 666 ]
entiers2 : [ 20 -1 40 0 666 ]
*/
