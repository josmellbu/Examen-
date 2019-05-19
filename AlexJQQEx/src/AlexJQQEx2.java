import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AlexJQQEx2{
    BufferedReader br = new BufferedReader(new 
    InputStreamReader(System.in));    
    
    public int leer(int dato, String texto){          
        try {
            System.out.println(texto);
            dato=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return dato;
    }
    
    public String leer(String dato, String texto){       
        try {
            System.out.println(texto);
            dato=br.readLine();
        } catch (IOException e) { 
            System.err.println(e.getMessage());
        }
        return dato;
    }
    
    public double leer(double dato, String texto){         
        try {
            System.out.println(texto);
            dato=Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    return dato;
    }
    
    public char leer(char dato, String mensage){
        try {
            System.out.println(mensage);
            dato=br.readLine().charAt(0);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    return dato;
    }
    public boolean leer(boolean dato, String texto){         
        try {
            System.out.println(texto);
            dato=Boolean.parseBoolean(br.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    return dato;
    }
    public static void Ex2AlexJQQ(){
        int AlexNum1,AlexNum2;
        int AlexResul=1;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        AlexNum1=leer.nextInt();
        System.out.println("Ingresa la operador: ");
        String AlexOpe=leer.next();
        System.out.println("Ingrese el segundo numero: ");
        AlexNum2=leer.nextInt();
        if(null != AlexOpe)switch (AlexOpe) {
            case "+":
                AlexResul=AlexNum1+AlexNum2;
                break;
            case "-":
                AlexResul=AlexNum1-AlexNum2;
                break;
            case "x":
                AlexResul=AlexNum1*AlexNum2;
                break;
        }if("/".equals(AlexOpe)){
            AlexResul=AlexNum1/AlexNum2;
        }
        System.out.println("el Resultado es "+AlexNum1+"+"+AlexOpe+"+"+AlexNum2+ " = "+AlexResul);
    }
          
    public static void main(String[] args) {
        Ex2AlexJQQ();
    }
}