
import java.util.Scanner;

public class AlexJQQEx5 {

public static void main(String[] args) {
        System.out.println("Ingrese el problema del examen que desea probar");
        System.out.println("Segun el orden del examen");
        Scanner leer=new Scanner(System.in);
        int opcion =leer.nextInt();
        while (opcion!=0){            
            switch(opcion){
            case 1: AlexJQQEx1.Exe1AlexJQQ();break;
            case 2: AlexJQQEx2.Ex2AlexJQQ();break;
            case 3: AlexJQQEx3.Ex3AlexJQQ();break;
            case 4: AlexJQQEx4.Ex4AlexJQQ();break;
            case 5: AlexJQQExC1.ExC1AlexJQQ();break;
            case 6: AlexJQQExC2.ExC2AlexJQQ(); ;break;
                                  
            default: System.out.println("Opción Inválida");break;
            }  
            System.out.println("Ingrese el problema del examen que desea probar");  
            System.out.println("Segun el orden del examen");
            opcion =leer.nextInt();
        }
}
}