class Voile{
     private int longueur ;
     private int largeur;
     protected int position ;
     public String couleur;
     private boolean enroule;
     private boolean deroule;

     Voile()
      {
      }
     Voile(int longeur,int largeur,int position,String couleur,boolean enroule,boolean deroule)
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
     }}