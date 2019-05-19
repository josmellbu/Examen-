
import java.util.Scanner;

public class AlexJQQEx1 {
    
    public static void Exe1AlexJQQ() {
        int AlexVehiT,inc=1;
        double AlexImpu1=1,AlexImpu2=1,AlexImpu3=1,AlexImpuT=1;
        Scanner i=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Vehiculos : ");
        AlexVehiT=i.nextInt();
        while(inc<=AlexVehiT){
            System.out.println("Ingrese la categoria: "+inc);
            int cat=i.nextInt();
            System.out.println("Ingrese el valor del Vehiculo: ");
            int cate1=i.nextInt();
            if(cat==1){
                AlexImpu1=cate1*0.10;
            }else if(cat==2){
                AlexImpu2=cate1*0.07;
            }else if(cat==3){
                AlexImpu3=cate1*0.05;
            }
          inc++; 
          AlexImpuT=AlexImpu1+AlexImpu2+AlexImpu3;
        }
        System.out.println("El impuesto total por los vehiculos es: "+AlexImpuT);
        System.out.println("El impuesto de los vehiculos de categoria 1: "+AlexImpu1);
        System.out.println("El impuesto de los vehiculos de categoria 2: "+AlexImpu2);
        System.out.println("El impuesto de los vehiculos de categoria 3: "+AlexImpu3);
    }
    
    public static void main(String[] args) {
        Exe1AlexJQQ();
    }
}

