public class Pont{
          private int id4=4;
          public int x;
          public int y;
          Voile voile;
           
         public Pont(int x,  int y)
         {       this.x=0;
                 this.y=0;}
             
          Pont(int x, int y, Voile voile)
        {
                 this.x=x;
                 this.y=y;
                 this.voile=voile;}
          
          boolean test(Boolean test)
          { 
           return(true);}
          
          public int getId4() {
		return id4;}
	
	public void setId(int id4) {
		this.id = id4;}
	
          public int getX() {
		return x;}
	
	public void setX(int x) {
		this.x = x;}
      
          public int getY() {
		return y;}
	
	public void setY(int y) {
		this.y = y;}
          
          public Voile getVoile() {
		return voile;}
	
	public void setVoile(Voile voile) {
		this.voile = voile;}
	
          
          
}
