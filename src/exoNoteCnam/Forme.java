package exoNoteCnam;

public class Forme {
	//propriétés
	private int surface;
	private String couleur;
	
	//constructeurs vide et initialisé
	public Forme(){
		surface = 0;
		couleur = "";
	}
	
	public Forme(int surface, String couleur){
		this.surface = surface;
		this.couleur = couleur;
	}

}
