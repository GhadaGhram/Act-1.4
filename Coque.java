public class Coque{
            private int id2=2;
            int p;
            int e;
 
           Coque(int p, int e)
          { this.p=0;
            this.e=0;
             }
           Coque(int p, int e )
          {
             this.p=p;
             this.e=e;}

           int Masse(int p, int e){
              int m= p*e;
              return m;}
      
           public int getId2() {
	  return id2;}
	
           public void setId2(int id2) {
	   this.id = id2;} 

           public String getP() {
		return p;
	}

           public void setP(String p) {
		this.p = p;
	}

           public String getE() {
		return e;
	}

           public void setE(String e) {
		this.e = e;
	}
}
