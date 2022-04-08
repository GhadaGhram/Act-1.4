class Bateau{
          private int id1=1;
          public String b1;
          public String b2;         
          Coque coque;
          Cabine cabine;
          Pont pont;
          boolean embarquer;
          boolean debarquer;
        
          Bateau(String b1,String b2)
         {       this.b1="b1";
                 this.b2="b2";
             }
          Bateau(String b1,String b2,Coque coque, Cabine cabine, Pont pont, boolean embarquer, boolean debarquer)
        {
                 this.b1=b1;
                 this.b2=b2;
                 this.Coque=coque;
                 this.Cabine=cabine;
                 this.Pont=pont;
                 this.embarquer=embarquer;
                 this.debarquer=debarquer;}
            
           boolean etat(boolean embarquer){
                                 int a=!embarquer;
                                 return a;}
           boolean etat(boolean debarquer){
                                 int b=!embarquer;
                                 return b;}
public String toString(Bateau bateau) {
		return "Le bateau n° " + bateau.getId1() + " est constitué de: \n" + "La coque n° " + 
	bateau.getCoque().getId2() + "\n La cabine n° " + bateau.getCabine().getId3() + "\n Le pont n° " + bateau.getPont().getId4()
	+ " est constitué de la Voile N° " + bateau.getPont().getVoile().getId6(); 
	}

	public Integer getId1() {
		return id1;
	}

	public void setId1(Integer id1) {
		this.id1 = id1;
	}

	public String getB1() {
		return b1;
	}

	public void setB1(String b1) {
		this.b1 = b1;
	}

	public String getB2() {
		return b2;
	}

	public void setB2(String b2) {
		this.b2 = b2;
	}

	public Coque getCoque() {
		return coque;
	}

	public void setCoque(Coque coque) {
		this.coque = coque;
	}

	public Cabine getCabine() {
		return cabine;
	}

	public void setCabine(Cabine cabine) {
		this.cabine = cabine;
	}

	public Pont getPont() {
		return pont;
	}

	public void setPont(Pont pont) {
		this.pont = pont;
	}
}

   
