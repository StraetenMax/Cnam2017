package exoNoteCnam;

public class Rectangle extends Quadrilatere{
	//propriété
	private int aire;
	
	//constructeurs vide et initialisé
	public Rectangle(){
		super();
		aire = 0;
	}
	public Rectangle(int surface, String couleur, String type,int aire){
		super(surface, couleur, type);
		this.aire = aire;
	}
	
	//accesseur et mutateur
	public int getAire(){
		return aire;
	}
	public void setAire(int aire){
		this.aire =aire;
	}

	//méthodes
	public boolean estDeMemeCouleurQue(Rectangle str){
		boolean str1;
		if(this.getCouleur() == str.getCouleur()){
			str1 = true;
		}else{
			str1 = false;
		}
		return str1;
	}
	
	public String description(){
		String str2 = super.description()+" qui a une aire de "+this.getAire();
		return str2;
	}
	
}
