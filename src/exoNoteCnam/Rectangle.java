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
	
}
