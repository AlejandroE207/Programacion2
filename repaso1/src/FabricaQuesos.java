
import java.util.Scanner;


public class FabricaQuesos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r,h,v,velCau,t;
        System.out.println("Ingresaremos las medidas de la caneca cilindrica...");
        System.out.print("Digite el valor del radio (r): ");
        r=sc.nextDouble();
        
        System.out.print("Digite el valor de la altura (h): ");
        h=sc.nextDouble();
        
        v=(Math.PI)*Math.pow(r, 2)*h;
        
        System.out.print("Ingrese por favor la velocidad del caudal en min: ");
        velCau=sc.nextDouble();
        
        t=v/velCau;
        
        System.out.println("El tiempo en llenarse la caneca es de: "+t);
        
        
    }
}
