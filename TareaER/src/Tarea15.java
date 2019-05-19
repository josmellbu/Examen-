import java.util.Scanner;


public class Tarea15 {



   public static void exe1() {
        int i;
        double salI, salR, anual;
        for (i=1; i<=6; i++) {
            System.out.print("Lapso " + i);
            salI=1500;
            anual=i;
            salR=salI*Math.pow(1.1,anual);
            System.out.println(" salario inicial: " + salI);
            System.out.println(" salario recibido: " + salR);
            System.out.println(" salario anual: " + anual);
            System.out.println();
    }
	}
   
   public static void exe2(){
    int S,D,T;
    String pago;
    double costoT=0;
    Scanner leer=new Scanner(System.in);
        System.out.println("Cantidad de hamburguesas sencillas");
        S=leer.nextInt();
        System.out.println("Cantidad de hamburguesas dobles");
        D=leer.nextInt();
        System.out.println("Cantidad de hamburguesas triples");
        T=leer.nextInt();
        System.out.println("Metodo de pago, Tarjeta o Efectivo");
        pago=leer.next();
        costoT=(S*20)+(D*25)+(T*28);
        
        if("Tarjeta".equals(pago)){
            costoT=costoT+(costoT*0.05);
        }
        System.out.println("La deuda total es"+costoT);
}
   
    public static void exe3() {
        Scanner in = new Scanner(System.in);
            int cantCero, i, mayores, menores, n;
            double cantidad;
            cantCero = 0;
            menores = 0;
            mayores = 0;
            System.out.print("Ingrese el valor de n: ");
                n = in.nextInt();
            in.nextLine();
            for (i=1; i<=n; i++) {
                System.out.print("PROCESO " + i);
                System.out.print("Ingrese el valor de cantidad: ");
                cantidad = in.nextDouble();
                if(cantidad==0)
                    cantCero=cantCero+1;
                if(cantidad<0)
                    menores=menores+1;
                if(cantidad>0)
                    mayores=mayores+1;
                System.out.println();
		}
            System.out.println("Valor de cantidades cero: " + cantCero);
            System.out.println("Valor de mayores a cero: " + mayores);
            System.out.println("Valor de menores a cero: " + menores);
	}
    
    public static void exe4(){
        int focoV;
        int focoB;
        int focoR;
        int focosT;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de los focos verdes: ");
        focoV=leer.nextInt();
        System.out.println("Ingrese la cantidad de los focos blancos: ");
        focoB=leer.nextInt();
        System.out.println("Ingrese la cantidad de los focos rojos: ");
        focoR=leer.nextInt();
        focosT=focoV+focoB+focoR;
        
        System.out.println("La cantidad de total de focos verdes es : "+focoV);
        System.out.println("La cantidad de total de focos blancos es : "+focoB);
        System.out.println("La cantidad de total de focos rojos es : "+focoR);
        System.out.println("La cantidad de total de focos es: "+focosT);
    }
    
    public static void exe5() {
        int i;
        double ahorroA, ahorroD;
        ahorroA = 0;
        for (i=1; i<=365; i++) {
            System.out.print("PROCESO " + i);
            ahorroA=ahorroA+0.01*Math.pow(3,i);
            ahorroD=ahorroA;
            System.out.println("Valor de ahorro diario: " + ahorroD);
            System.out.println();
        }
        System.out.println("Valor de ahorro anual: " + ahorroA);
    }
    
    public static void exe8() {
        double N = 0,descuento = 0,precioT;
         
        Scanner leer=new Scanner(System.in);
            System.out.println("Ingrese el total a pagar:");
            N=leer.nextDouble();
            descuento=(N*0.12);
            if (N<=100){
                descuento=(N*0.10);
            }else if (N>=200){
                descuento=(N*0.15);
            }
            precioT=N-descuento;
            System.out.println("El decuento es: "+descuento);
            System.out.println("El total a pagar es: "+precioT);
            }
    
    public static void exe10(){
        Scanner entrada=new Scanner(System.in);
        int edad,acumulador=0;
        for (int x=1;x<=40;x++){
            System.out.println("Ingrese las edades ");
            edad=entrada.nextInt();
            acumulador=acumulador+edad;
        }
        System.out.println("el promedio de la edad de la escuela es de: "+acumulador/40);
    }
    
    public static void exe12(){
        int moneda,billete;
        double total;
                
        Scanner leer=new Scanner(System.in);
            System.out.println("Ingrese el valor de mondas:");
        moneda=leer.nextInt();
            System.out.println("Ingrese el valor de los billetes");
        billete=leer.nextInt();
            total=moneda+billete;
                System.out.println("El total es "+total);
    }
    
    public static void exe14() {
        Scanner in = new Scanner(System.in);
        int Apro, i, n, Repro;
        double calificacion;
        Apro = 0;
        Repro = 0;
        System.out.print("Ingrese la cantidad de alumnos: ");
        n = in.nextInt();
        in.nextLine();
            for (i=1; i<=n; i++) {
                System.out.print("Alumno " + i);
                System.out.print(" Ingrese la calificacion: ");
                calificacion = in.nextDouble();
                if(calificacion<13)
                        Apro=Apro+1;
                else
                        Repro=Repro+1;
                System.out.println();
        }
            System.out.println("Cantidad de aprobados: " + Apro);
            System.out.println("cantidad de reprobados: " + Repro);
	}
    
    public static void exe16() {
        Scanner in = new Scanner(System.in);
        int i;
        double cubo, numero;
        String tecla_repetir;
        do {
                System.out.print("Ingrese el valor de un numero: ");
                numero = in.nextDouble();
                cubo=numero*numero*numero;
                System.out.println("Valor de cubo: " + cubo);
                System.out.println();
                do {
                        System.out.print("Desea repetir el proceso? (S/N): ");
                        tecla_repetir = in.nextLine();
                } while (!tecla_repetir.equalsIgnoreCase("s") && !tecla_repetir.equalsIgnoreCase("n"));
        } while (tecla_repetir.equalsIgnoreCase("s"));
    }
    
    public static void exe17(){
       for (int inicio = 1; inicio <=10; inicio++) {
           for (int numi = 1; numi <=10; numi++) {
              System.out.println(inicio+"*"+numi+"="+(inicio*numi)); 
           }
           System.out.println("\n");
       }
   }
    
    public static void exe18(){
        double inverA=0;
        int inc=1;
        double inverT=0;
        double cant=1500;
        inverA=(cant*0.15)/100;
        inverT=inverA*58;
        System.out.println("La cantidad de la invercion al año sera de: "+inverA);
        System.out.println("La cantidad de la invercion en el año 2019 sera de: "+inverT); 
           
    }
    
    public static void exe21(){
        int moneda10,moneda5,moneda1;
        int billete10,billete20,billete50;
        double total;
        Scanner leer=new Scanner(System.in);
            System.out.println("Ingrese la cantidad de mondas de 10 soles:");
        moneda10=leer.nextInt();
            System.out.println("Ingrese la cantidad de mondas de 5 soles:");
        moneda5=leer.nextInt();
            System.out.println("Ingrese la cantidad de mondas de 1 soles:");
        moneda1=leer.nextInt();
            System.out.println("Ingrese la cantidad de billetes de 10 soles:");
        billete10=leer.nextInt();
            System.out.println("Ingrese la cantidad de billetes de 20 soles:");
        billete20=leer.nextInt();
            System.out.println("Ingrese la cantidad de billetes de 50 soles:");
        billete50=leer.nextInt();
        total=(moneda10*10)+(moneda5*5)+moneda1+(billete10*10)+(billete20*20)+(billete50*50);
            System.out.println("La cantidad de dinero total es: "+total);
    }
    
    public static void main(String[] args) {
        System.out.println("Ingrese el algoritmo que desea probar");
        Scanner leer=new Scanner(System.in);
        int opcion =leer.nextInt();
        while (opcion!=0) {            
            switch(opcion){
            case 1: exe1(); break;
            case 2: exe2(); break;
            case 3: exe3(); break;
            case 4: exe4(); break;
            case 5: exe5(); break;
            case 6: exe8(); break;
            case 7: exe10(); break;
            case 8: exe12(); break;
            case 9: exe14(); break;
            case 10: exe16(); break;
            case 11: exe17(); break;
            case 12: exe18(); break;
            case 13: exe21(); break;
            default: System.out.println("Opcion invalida");break;
            }  
            System.out.println("Ingrese el algoritmo que desea probar");            
            opcion =leer.nextInt();
        }
    }
}
