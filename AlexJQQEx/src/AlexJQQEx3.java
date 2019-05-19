
import java.util.Scanner;


public class AlexJQQEx3 {
    
    public int[] AlexJQQOrdeAscendente(int[] vector){
        int aux, j;
        for (int i = 1; i < vector.length; i++) {
            aux=vector[i];
            j=i;
            while(j>0 && aux<vector[j-1]){
            vector[j]=vector[j-1];
            j--;
            }
            vector[j]=aux;
        }
    return vector;
    }
    
    public int[] AlexJQQOrdeDescendente(int[] vec){
        int aux, j;
        for (int i = 1; i < vec.length; i++) {
            aux=vec[i];
            j=i;
            while(j>0 && aux>vec[j-1]){
            vec[j]=vec[j-1];
            j--;
            }
            vec[j]=aux;
        }        
    return vec;
    }
    
        public void imprimir(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector["+i+"]="+vector[i]);
        }
    }
    
    public static void Ex3AlexJQQ() {
        String AlexJQQDe;
        int[] vector={42,57,14,40,96,19,8,68,1,4};
        AlexJQQEx3 alex=new AlexJQQEx3();
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese Ascendente o Descendente Segun a la forma deseada:");
        //Se suguiere que la primera letra sea mayuscula ejem: "Asecendente"
        AlexJQQDe=leer.next();
        if (AlexJQQDe.equals("Ascendente")){
            alex.imprimir(alex.AlexJQQOrdeAscendente(vector));
            System.out.println("Ascendente");
        }else if (AlexJQQDe.equals("Descendente")){
            alex.imprimir(alex.AlexJQQOrdeDescendente(vector));
            System.out.println("Descendente");
        }
    }
    
    public static void main(String[] args) {
        Ex3AlexJQQ();
    }
}
