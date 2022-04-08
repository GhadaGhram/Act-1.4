public class Cabine{
           private int id3=3;
           public int H;
           public int L;
           public int l;
          
         Cabine(int H, int L)
         {       this.H=0;
                 this.L=0;}
             
          Cabine(int H, int L, int l )
        {        
                 this.H=H;
                 this.L=L;
                 this.l=l;}
 
          int Volume(int H, int L, int l){
                   int V= H*L*l;
                   return V;}
         
           public int getId3() {
		return id3;}
	
	public void setId3(int id3) {
		this.id3 = id3;}
	
}
