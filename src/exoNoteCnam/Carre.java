package exoNoteCnam;

public class Carre extends Quadrilatere{
	//propriétés
	private int tailleCote;
	private Boolean grand;
	
	//constructeurs vide et initialisé
	public Carre(){
		super();
		tailleCote = 0;
		grand = true;
	}
	public Carre(int surface, String couleur, String type, int tailleCote){
		super(surface, couleur,type);
		this.tailleCote = tailleCote;
		grand = true;
	}
	
	//accesseurs et mutateurs

}
