class Cabine{
           final int IDU3=3;
           int H;
           int L;
           int l;
          
         Cabine()
         {
             }
          Cabine(int H, int L, int l )
        {        
                 this.H=H;
                 this.L=L;
                 this.l=l;}
 
    int volume(int H, int L, int l){
                   int V= H*L*l;
                   return V;
}
}