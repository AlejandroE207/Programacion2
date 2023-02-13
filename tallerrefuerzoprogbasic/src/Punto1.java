
import java.util.Scanner;

public class Punto1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,r;
        System.out.print("Ingrese el primer numero: ");
        num1= sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2= sc.nextInt();
        
        r=num1+num2;
        System.out.println("El resultado de la suma entre "+num1+" y "+num2+" es: "+r);
    }
}

//PROGRAMACION CON FUNCIONES O MODULOS

//public class Punto1 {
//    public static int sumar(int a, int b){
//        int r=a+b;
//        return r;
//    }
//            
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num1,num2;
//        System.out.print("Ingrese el primer numero: ");
//        num1= sc.nextInt();
//        System.out.print("Ingrese el segundo numero: ");
//        num2= sc.nextInt();
//        
//
//        System.out.println("El resultado de la suma entre "+num1+" y "+num2+" es: "+sumar(num1, num2));
//    }
//}
