public class Pont{
          private int id=4;
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
          
          public int getId() {
		return id;}
	
	public void setId(int id) {
		this.id = id;}
	
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
