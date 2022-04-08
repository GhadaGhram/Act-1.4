public class Voile{
       private int id6=6;
       private int longueur ;
       private int largeur;
       protected String forme ;
       public String couleur;
       private boolean enroule;
       private boolean deroule;

     public Voile(int longueur,int largeur)
      {        this.longueur=0;
               this.largeur=0;
      }
     public Voile(int longeur,int largeur,int position,String couleur,boolean enroule,boolean deroule)
     {
               this.longueur=longueur;
               this.largeur=largeur;
               this.position=position;
               this.couleur=couleur;
               this.enroule=enroule;
               this.deroule=deroule;
      }
      
     boolean enrouler (boolean enroule) { 
                                                                        boolean a=!enroule;
                                                                        return a;                                       
     }

     boolean derouler (boolean deroule) { 
                                                                        boolean b=!deroule;
                                                                        return b;                                       
    public int getId6() {
		return id6;
	}

	public void setId6(int id6) {
		this.id6 = id6;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longeur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public String getForme() {
		return forme;
	}

	public void setForme(String forme) {
		this.forme = forme;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public boolean isEnroule() {
		return enroule;
	}

	public void setEnroule(boolean enroule) {
		this.enroule = enroule;
	}

	public boolean isDeroule() {
		return deroule;
	}

	public void setDeroule(boolean deroule) {
		this.deroule = deroule;
	}
	
	
}
     }}
