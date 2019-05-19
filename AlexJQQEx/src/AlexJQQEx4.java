
import java.util.Scanner;


public class AlexJQQEx4 {
    
    public int AlexJQQBusqueda(int[] v, int valorB){  
        int posicion=0;
        for (int i = 0; i < v.length; i++) {
            if(v[i]==valorB){
                posicion= i;
                break;
            }else{           
            }
        }
    return posicion;
    }
    public int numero(int n){
        
        return n;
    
    }       
    public static void Ex4AlexJQQ() {
        AlexJQQEx4 Alex=new AlexJQQEx4();
        int[] vector={1,10,9,8,11,7,6,12,2,3,4,5};
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la numeracion del mes a buscarlo: ");
        int n=leer.nextInt();
        System.out.println("El numeracion del mes es "+n+"y que fue encontrado en la posicion "+Alex.AlexJQQBusqueda(vector, n)+" del vector");
    }
    public static void main(String[] args) {
        Ex4AlexJQQ();
    }
    

}
