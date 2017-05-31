package exoNoteCnam;

public class Quadrilatere extends Forme{
	//propriétés
	private String type;
	
	//constructeurs vide et initialisé
	public Quadrilatere(){
		super();
		type = "";
	}
	public Quadrilatere(int surface, String couleur, String type){
		super(surface, couleur);
		this.type = type;
	}
	
	//accesseur et mutateur
	public String getType(){
		return type;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	//méthodes
	public String afficher(){
		String str = "Quadrilatere affiche";
		return str;
	}
	public String description(){
		String str1 = super.description()+" qui est de type "+this.getType();
		return str1;
	}
}
