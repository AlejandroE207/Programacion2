
import java.util.Scanner;


public class ReglaDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,x;
        
        System.out.println("""
                           Recordemos que la regla de 3 es de la siguiente manera:
                           a ---> b
                           c ---> x
                           """);
        System.out.println("Acontinuación ingresaremos los valores para la regla de tres.");
        System.out.print("Ingrese el valor de a: ");
        a=sc.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        b=sc.nextDouble();
        System.out.print("Ingrece el valor de c: ");
        c=sc.nextDouble();
        
        x=(b*c)/a;
        System.out.println("El resultado es: "+x);
        
    }
}
