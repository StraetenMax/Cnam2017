package exoNoteCnam;

public class Carre extends Quadrilatere{
	//propriétés
	private int tailleCote;
	private boolean grand;
	
	//constructeurs vide et initialisé
	public Carre(){
		super();
		tailleCote = 0;
		this.setGrand();
	}
	public Carre(int surface, String couleur, String type, int tailleCote){
		super(surface, couleur,type);
		this.tailleCote = tailleCote;
		this.setGrand();
	}
	
	//accesseurs et mutateurs
	public int getTailleCote(){
		return tailleCote;
	}
	public void setTailleCote(int tailleCote){
		this.tailleCote = tailleCote;
		this.setGrand();
	}
	public boolean getGrand(){
		return grand;
	}
	public void setGrand(){
		if(tailleCote > 10){
			grand = true;
		}else{
			grand = false;
		}
	}
	//méthodes
	public boolean estPlusGrandQue(Carre str){
		boolean str1;
		if(this.tailleCote >str.tailleCote){
			str1 = true;
		}else{
			str1 = false;
		}
		return str1;
	}
	
	public String description(){
		String str2 = super.description()+" dont le coté mesure "+this.getTailleCote()+" cm";
		return str2;
	}


}
