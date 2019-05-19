
public class AlexJQQExC2 {
    
    public void AlexJQQordenamiento(int[]vector,int izq, int der){
        int pivote=vector[izq]; 
        int i=izq; 
        int j=der; 
        int aux;
        while(i<j){                               
            if(vector[i]<=pivote && i<j){
            i++;                             
            }
            if(vector[j]>pivote){
            j--;                              
            }
            if (i<j) {                                               
            aux= vector[i];                 
            vector[i]=vector[j];
            vector[j]=aux;
            }
        }
        vector[izq]=vector[j]; 
        vector[j]=pivote; 
        if(izq<j-1)
            AlexJQQordenamiento(vector,izq,j-1); 
        if(j+1 <der)
            AlexJQQordenamiento(vector,j+1,der); 
      }
    
    public static void ExC2AlexJQQ() {
        AlexJQQExC2 alex=new AlexJQQExC2();
            int vector[]={70,-4,0,30,20,50,4,17};
            alex.AlexJQQordenamiento(vector, 0 ,vector.length-1);
            for(int i =0; i<vector.length; i++){
                System.out.print(vector[i]+ " ");
            }
            System.out.println("\n");
	}
    
    public static void main(String[] args) {
        ExC2AlexJQQ();
    }
}
