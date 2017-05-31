package exoNoteCnam;

public class Main {

	public static void main(String[] args) {
		//instancier les classes
		Forme F1 = new Forme(123, "blanc");

		Quadrilatere Q1 = new Quadrilatere(145, "Bleu", "concave");
		Carre C1 = new Carre(127, "Vert", "convexe", 4);
		Carre C2 = new Carre(169, "Rouge", "croisé", 6);

		Rectangle R1 = new Rectangle(115, "Bleu", "convexe", 18);
		Rectangle R2 = new Rectangle(189, "Gris", "concave", 22);
	
		//appeler les méthodes
		System.out.println(F1.description());
		System.out.println(Q1.description());
		System.out.println(R1.description());


		System.out.println(C1.estPlusGrandQue(C2));
		System.out.println(R1.estDeMemeCouleurQue(R2)); 
	}

}
